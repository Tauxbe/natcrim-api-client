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
import org.openapitools.client.model.MaxResults2;
import org.openapitools.client.model.OrderResultFailure;
import org.openapitools.client.model.OrderResultSuccess;

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
 * OrderResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-26T03:22:31.964655Z[Etc/UTC]")
public class OrderResult {
  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private Object completedAt = null;

  public static final String SERIALIZED_NAME_FAILURE = "failure";
  @SerializedName(SERIALIZED_NAME_FAILURE)
  private OrderResultFailure failure;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private OrderResultSuccess success;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "max_results";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private MaxResults2 maxResults = false;

  public OrderResult() {
  }

  public OrderResult completedAt(Object completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  public Object getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(Object completedAt) {
    this.completedAt = completedAt;
  }


  public OrderResult failure(OrderResultFailure failure) {
    
    this.failure = failure;
    return this;
  }

   /**
   * Get failure
   * @return failure
  **/
  @javax.annotation.Nonnull
  public OrderResultFailure getFailure() {
    return failure;
  }


  public void setFailure(OrderResultFailure failure) {
    this.failure = failure;
  }


  public OrderResult success(OrderResultSuccess success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  public OrderResultSuccess getSuccess() {
    return success;
  }


  public void setSuccess(OrderResultSuccess success) {
    this.success = success;
  }


  public OrderResult maxResults(MaxResults2 maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @javax.annotation.Nullable
  public MaxResults2 getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(MaxResults2 maxResults) {
    this.maxResults = maxResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResult orderResult = (OrderResult) o;
    return Objects.equals(this.completedAt, orderResult.completedAt) &&
        Objects.equals(this.failure, orderResult.failure) &&
        Objects.equals(this.success, orderResult.success) &&
        Objects.equals(this.maxResults, orderResult.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, failure, success, maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResult {\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
    openapiFields.add("completed_at");
    openapiFields.add("failure");
    openapiFields.add("success");
    openapiFields.add("max_results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("completed_at");
    openapiRequiredFields.add("failure");
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderResult is not found in the empty JSON string", OrderResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `failure`
      OrderResultFailure.validateJsonElement(jsonObj.get("failure"));
      // validate the required field `success`
      OrderResultSuccess.validateJsonElement(jsonObj.get("success"));
      // validate the optional field `max_results`
      if (jsonObj.get("max_results") != null && !jsonObj.get("max_results").isJsonNull()) {
        MaxResults2.validateJsonElement(jsonObj.get("max_results"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderResult>() {
           @Override
           public void write(JsonWriter out, OrderResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderResult
  * @throws IOException if the JSON string is invalid with respect to OrderResult
  */
  public static OrderResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderResult.class);
  }

 /**
  * Convert an instance of OrderResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

