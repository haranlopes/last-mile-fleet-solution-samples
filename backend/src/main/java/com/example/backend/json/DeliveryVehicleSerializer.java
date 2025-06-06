/* Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.backend.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.maps.fleetengine.delivery.v1.DeliveryVehicle;
import java.lang.reflect.Type;

/** Class to provide serialization for DeliveryVehicle protos into JSON. */
final class DeliveryVehicleSerializer implements JsonSerializer<DeliveryVehicle> {
  @Override
  public JsonElement serialize(
      DeliveryVehicle src, Type typeOfSrc, JsonSerializationContext context) {
    SerializedDeliveryVehicle vehicle =
        SerializedDeliveryVehicle.newBuilder().setName(src.getName()).build();

    return new Gson().toJsonTree(vehicle);
  }
}
