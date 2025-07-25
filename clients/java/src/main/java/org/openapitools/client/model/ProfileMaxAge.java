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
import org.openapitools.client.model.MaxAgeFieldSelector;
import org.openapitools.client.model.MaxAgeGet;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.natcrim.api.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-26T03:22:31.964655Z[Etc/UTC]")
public class ProfileMaxAge extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ProfileMaxAge.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ProfileMaxAge.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ProfileMaxAge' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MaxAgeGet> adapterMaxAgeGet = gson.getDelegateAdapter(this, TypeToken.get(MaxAgeGet.class));

            return (TypeAdapter<T>) new TypeAdapter<ProfileMaxAge>() {
                @Override
                public void write(JsonWriter out, ProfileMaxAge value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MaxAgeGet`
                    if (value.getActualInstance() instanceof MaxAgeGet) {
                      JsonElement element = adapterMaxAgeGet.toJsonTree((MaxAgeGet)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemae: MaxAgeGet, Object");
                }

                @Override
                public ProfileMaxAge read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MaxAgeGet
                    try {
                      // validate the JSON object to see if any exception is thrown
                      MaxAgeGet.validateJsonElement(jsonElement);
                      actualAdapter = adapterMaxAgeGet;
                      ProfileMaxAge ret = new ProfileMaxAge();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for MaxAgeGet failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'MaxAgeGet'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for ProfileMaxAge: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ProfileMaxAge() {
        super("anyOf", Boolean.FALSE);
    }

    public ProfileMaxAge(MaxAgeGet o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ProfileMaxAge(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MaxAgeGet", MaxAgeGet.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ProfileMaxAge.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * MaxAgeGet, Object
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MaxAgeGet) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MaxAgeGet, Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * MaxAgeGet, Object
     *
     * @return The actual instance (MaxAgeGet, Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MaxAgeGet`. If the actual instance is not `MaxAgeGet`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MaxAgeGet`
     * @throws ClassCastException if the instance is not `MaxAgeGet`
     */
    public MaxAgeGet getMaxAgeGet() throws ClassCastException {
        return (MaxAgeGet)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProfileMaxAge
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate anyOf schemas one by one
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with MaxAgeGet
    try {
      MaxAgeGet.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MaxAgeGet failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    throw new IOException(String.format("The JSON string is invalid for ProfileMaxAge with anyOf schemas: MaxAgeGet, Object. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    
  }

 /**
  * Create an instance of ProfileMaxAge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProfileMaxAge
  * @throws IOException if the JSON string is invalid with respect to ProfileMaxAge
  */
  public static ProfileMaxAge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfileMaxAge.class);
  }

 /**
  * Convert an instance of ProfileMaxAge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

