package webServer


import bananas.service.BananaApi
import bananas.service.CreateBanana
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.vertx.core.Vertx
import io.vertx.core.json.Json
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.ext.web.handler.ResponseContentTypeHandler
import io.vertx.kotlin.core.deployVerticleAwait
import io.vertx.kotlin.core.http.listenAwait
import io.vertx.kotlin.coroutines.CoroutineVerticle
import kotlinx.coroutines.runBlocking


class MainVerticle : CoroutineVerticle() {
    override suspend fun start() {
        Json.mapper.registerModule(KotlinModule())
        vertx.createHttpServer()

                .requestHandler(Router.router(vertx).apply {
                    route()
                            .handler(ResponseContentTypeHandler.create())
                            .handler(BodyHandler.create())
                            .produces("application/json")
                    val api = BananaApi()
                    get("/bananas/:id").handler {
                        val id = it.request().getParam("id")
                        it.response().end(
                                Json.encodeToBuffer(api.getBanana(id))
                        )
                    }
                    post("/bananas").handler {
                        val createBanana = it.bodyAsJson.mapTo(CreateBanana::class.java)
                        val newBanana = api.createBanana(createBanana)
                        it.response().end(Json.encode(newBanana))
                    }
                    post("/bananas").handler { it.response().end() }
                }).listenAwait(8080)
        println("server us up on port 8080")
    }
}

fun main() {
    val vertx = Vertx.vertx()
    runBlocking {
        vertx.deployVerticleAwait(MainVerticle())
    }

}
