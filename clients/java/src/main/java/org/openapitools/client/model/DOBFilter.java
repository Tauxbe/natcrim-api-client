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
 * DOBFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-26T03:22:31.964655Z[Etc/UTC]")
public class DOBFilter {
  public static final String SERIALIZED_NAME_ALLOW_OFF_BY_ONE = "allow_off_by_one";
  @SerializedName(SERIALIZED_NAME_ALLOW_OFF_BY_ONE)
  private Boolean allowOffByOne = false;

  public static final String SERIALIZED_NAME_ALLOW_EMPTY_DOB = "allow_empty_dob";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY_DOB)
  private Boolean allowEmptyDob = false;

  public static final String SERIALIZED_NAME_MINIMUM_COMPONENTS_MATCHED = "minimum_components_matched";
  @SerializedName(SERIALIZED_NAME_MINIMUM_COMPONENTS_MATCHED)
  private Integer minimumComponentsMatched = 3;

  public DOBFilter() {
  }

  public DOBFilter allowOffByOne(Boolean allowOffByOne) {
    
    this.allowOffByOne = allowOffByOne;
    return this;
  }

   /**
   * Allow any one part of the DOB: month, day, year, to be different by no more than 1.
   * @return allowOffByOne
  **/
  @javax.annotation.Nullable
  public Boolean getAllowOffByOne() {
    return allowOffByOne;
  }


  public void setAllowOffByOne(Boolean allowOffByOne) {
    this.allowOffByOne = allowOffByOne;
  }


  public DOBFilter allowEmptyDob(Boolean allowEmptyDob) {
    
    this.allowEmptyDob = allowEmptyDob;
    return this;
  }

   /**
   * Match records with no DOB
   * @return allowEmptyDob
  **/
  @javax.annotation.Nullable
  public Boolean getAllowEmptyDob() {
    return allowEmptyDob;
  }


  public void setAllowEmptyDob(Boolean allowEmptyDob) {
    this.allowEmptyDob = allowEmptyDob;
  }


  public DOBFilter minimumComponentsMatched(Integer minimumComponentsMatched) {
    
    this.minimumComponentsMatched = minimumComponentsMatched;
    return this;
  }

   /**
   * How many of the parts of the DOB must match the searched DOB
   * minimum: 1
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
    DOBFilter doBFilter = (DOBFilter) o;
    return Objects.equals(this.allowOffByOne, doBFilter.allowOffByOne) &&
        Objects.equals(this.allowEmptyDob, doBFilter.allowEmptyDob) &&
        Objects.equals(this.minimumComponentsMatched, doBFilter.minimumComponentsMatched);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOffByOne, allowEmptyDob, minimumComponentsMatched);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DOBFilter {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to DOBFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DOBFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DOBFilter is not found in the empty JSON string", DOBFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DOBFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DOBFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DOBFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DOBFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DOBFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DOBFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<DOBFilter>() {
           @Override
           public void write(JsonWriter out, DOBFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DOBFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DOBFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DOBFilter
  * @throws IOException if the JSON string is invalid with respect to DOBFilter
  */
  public static DOBFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DOBFilter.class);
  }

 /**
  * Convert an instance of DOBFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

