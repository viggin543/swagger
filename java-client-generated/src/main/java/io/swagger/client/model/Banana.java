/*
 * OpenAPIDefinition annotation is required only once in a project
 *  ### markdown is supported</br> ---
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Banana
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-24T20:48:54.388+03:00[Asia/Jerusalem]")public class Banana {
  /**
   * Gets or Sets color
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    BROWN("BROWN");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("color")
  private ColorEnum color = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("nickname")
  private String nickname = null;
  public Banana color(ColorEnum color) {
    this.color = color;
    return this;
  }

  

  /**
  * Get color
  * @return color
  **/
  @Schema(description = "")
  public ColorEnum getColor() {
    return color;
  }
  public void setColor(ColorEnum color) {
    this.color = color;
  }
  public Banana price(Double price) {
    this.price = price;
    return this;
  }

  

  /**
  * price in USD
  * maximum: 256
  * @return price
  **/
  @Schema(example = "5", description = "price in USD")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  public Banana id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * UUID
  * @return id
  **/
  @Schema(example = "29F44D73-B94A-4260-A73D-E6A94A766906", description = "UUID")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public Banana nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  

  /**
  * Get nickname
  * @return nickname
  **/
  @Schema(description = "")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banana banana = (Banana) o;
    return Objects.equals(this.color, banana.color) &&
        Objects.equals(this.price, banana.price) &&
        Objects.equals(this.id, banana.id) &&
        Objects.equals(this.nickname, banana.nickname);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(color, price, id, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banana {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
