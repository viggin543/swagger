package webServer


import io.swagger.client.ApiCallback
import io.swagger.client.ApiClient
import io.swagger.client.ApiException
import io.swagger.client.api.BananasApi
import io.swagger.client.model.Banana
import io.swagger.client.model.CreateBanana
import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.kotlin.core.closeAwait
import io.vertx.kotlin.core.deployVerticleAwait
import io.vertx.kotlin.coroutines.awaitResult
import kotlinx.coroutines.runBlocking
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import kotlin.test.assertEquals


internal class AppKtTest {

    companion object {
        lateinit var vertx:Vertx
        lateinit var apiInstace : BananasApi

        @JvmStatic
        @BeforeClass
        fun b4Class(){
            vertx = Vertx.vertx()
            runBlocking {
                vertx.deployVerticleAwait(MainVerticle())
            }
            apiInstace = BananasApi(ApiClient()
                    .setBasePath("http://localhost:8080/")
            )
        }

        @JvmStatic
        @AfterClass
        fun tearDownClass(){
            runBlocking { vertx.closeAwait() }
        }
    }

     @Test fun  `blocking example` () {
         val actual = apiInstace.createBanana(CreateBanana().color("GREEN").price(2.0))
         assertEquals(Banana().color(Banana.ColorEnum.GREEN).price(2.0).id("iddqd"),actual,
                 "created a new banana as expected")
     }

    @Test fun `async generated client example`(){
        val actual = runBlocking {
            awaitResult<Banana> {
                apiInstace.createBananaAsync(CreateBanana().color("GREEN").price(2.0), object : ApiCallback<Banana> {
                    override fun onSuccess(result: Banana?, statusCode: Int, responseHeaders: MutableMap<String, MutableList<String>>?) {
                        it.handle(Future.succeededFuture(result!!))
                    }
                    override fun onFailure(e: ApiException?, statusCode: Int, responseHeaders: MutableMap<String, MutableList<String>>?) {
                        it.handle(Future.failedFuture(e))
                    }
                    override fun onUploadProgress(bytesWritten: Long, contentLength: Long, done: Boolean) {}
                    override fun onDownloadProgress(bytesRead: Long, contentLength: Long, done: Boolean) {}
                })
            }
        }
        assertEquals(Banana().color(Banana.ColorEnum.GREEN).price(2.0).id("iddqd"),actual,
                "created a new banana as expected")
    }
}
