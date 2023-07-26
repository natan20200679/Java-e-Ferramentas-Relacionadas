/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.andrelugomes.utils;

public class StringLocationUtils {
  public static Double[] transform(String geolocation) {
    String result = geolocation.replace("(", "").replace(")", "");
    String[] strings = result.trim().split(",");
    return new Double[] {Double.valueOf(strings[0]), Double.valueOf(strings[1])};
  }
}
