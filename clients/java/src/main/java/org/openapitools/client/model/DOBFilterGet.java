/*
 * NatCrim Service Integration
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.3.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.natcrim.api.client.JSON;

/**
 * DOBFilterGet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-26T03:22:31.964655Z[Etc/UTC]")
public class DOBFilterGet {
  public static final String SERIALIZED_NAME_ALLOW_OFF_BY_ONE = "allow_off_by_one";
  @SerializedName(SERIALIZED_NAME_ALLOW_OFF_BY_ONE)
  private Boolean allowOffByOne = false;

  public static final String SERIALIZED_NAME_ALLOW_EMPTY_DOB = "allow_empty_dob";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY_DOB)
  private Boolean allowEmptyDob = false;

  public static final String SERIALIZED_NAME_MINIMUM_COMPONENTS_MATCHED = "minimum_components_matched";
  @SerializedName(SERIALIZED_NAME_MINIMUM_COMPONENTS_MATCHED)
  private Integer minimumComponentsMatched = 3;

  public DOBFilterGet() {
  }

  public DOBFilterGet allowOffByOne(Boolean allowOffByOne) {
    
    this.allowOffByOne = allowOffByOne;
    return this;
  }

   /**
   * Get allowOffByOne
   * @return allowOffByOne
  **/
  @javax.annotation.Nullable
  public Boolean getAllowOffByOne() {
    return allowOffByOne;
  }


  public void setAllowOffByOne(Boolean allowOffByOne) {
    this.allowOffByOne = allowOffByOne;
  }


  public DOBFilterGet allowEmptyDob(Boolean allowEmptyDob) {
    
    this.allowEmptyDob = allowEmptyDob;
    return this;
  }

   /**
   * Get allowEmptyDob
   * @return allowEmptyDob
  **/
  @javax.annotation.Nullable
  public Boolean getAllowEmptyDob() {
    return allowEmptyDob;
  }


  public void setAllowEmptyDob(Boolean allowEmptyDob) {
    this.allowEmptyDob = allowEmptyDob;
  }


  public DOBFilterGet minimumComponentsMatched(Integer minimumComponentsMatched) {
    
    this.minimumComponentsMatched = minimumComponentsMatched;
    return this;
  }

   /**
   * Get minimumComponentsMatched
   * minimum: 0
   * maximum: 3
   * @return minimumComponentsMatched
  **/
  @javax.annotation.Nullable
  public Integer getMinimumComponentsMatched() {
    return minimumComponentsMatched;
  }


  public void setMinimumComponentsMatched(Integer minimumComponentsMatched) {
    this.minimumComponentsMatched = minimumComponentsMatched;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DOBFilterGet doBFilterGet = (DOBFilterGet) o;
    return Objects.equals(this.allowOffByOne, doBFilterGet.allowOffByOne) &&
        Objects.equals(this.allowEmptyDob, doBFilterGet.allowEmptyDob) &&
        Objects.equals(this.minimumComponentsMatched, doBFilterGet.minimumComponentsMatched);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOffByOne, allowEmptyDob, minimumComponentsMatched);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DOBFilterGet {\n");
    sb.append("    allowOffByOne: ").append(toIndentedString(allowOffByOne)).append("\n");
    sb.append("    allowEmptyDob: ").append(toIndentedString(allowEmptyDob)).append("\n");
    sb.append("    minimumComponentsMatched: ").append(toIndentedString(minimumComponentsMatched)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allow_off_by_one");
    openapiFields.add("allow_empty_dob");
    openapiFields.add("minimum_components_matched");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DOBFilterGet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DOBFilterGet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DOBFilterGet is not found in the empty JSON string", DOBFilterGet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DOBFilterGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DOBFilterGet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DOBFilterGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DOBFilterGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DOBFilterGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DOBFilterGet.class));

       return (TypeAdapter<T>) new TypeAdapter<DOBFilterGet>() {
           @Override
           public void write(JsonWriter out, DOBFilterGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DOBFilterGet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DOBFilterGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DOBFilterGet
  * @throws IOException if the JSON string is invalid with respect to DOBFilterGet
  */
  public static DOBFilterGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DOBFilterGet.class);
  }

 /**
  * Convert an instance of DOBFilterGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

