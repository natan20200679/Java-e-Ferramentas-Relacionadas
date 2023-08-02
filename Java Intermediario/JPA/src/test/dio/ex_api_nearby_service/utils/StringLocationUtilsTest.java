/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test.dio.ex_api_nearby_service.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringLocationUtilsTest {

  @Test
  public void shouldExtractGeoLocationsFormString() {
      
    String geoLocation = "(123, 321)";

    Double[] transform = StringLocationUtils.transform(geoLocation);

    assertEquals(123.0, transform[0], "Not equal");
    assertEquals(321, transform[1], "Not equal");
 
  }

}
