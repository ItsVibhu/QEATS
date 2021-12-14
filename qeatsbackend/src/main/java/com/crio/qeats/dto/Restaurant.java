
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

// TODO: CRIO_TASK_MODULE_SERIALIZATION
//  Implement Restaurant class.
// Complete the class such that it produces the following JSON during serialization.
// {
//  "restaurantId": "10",
//  "name": "A2B",
//  "city": "Hsr Layout",
//  "imageUrl": "www.google.com",
//  "latitude": 20.027,
//  "longitude": 30.0,
//  "opensAt": "18:00",
//  "closesAt": "23:00",
//  "attributes": [
//    "Tamil",
//    "South Indian"
//  ]
// }

@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant {
  @Getter  
  private String restaurantId;
  @Getter 
  private String name;
  @Getter 
  private String city;
  @Getter 
  private String imageUrl;
  @Getter 
  private double latitude;
  @Getter 
  private double longitude;
  @Getter 
  private String opensAt;
  @Getter 
  private String closesAt;
  @Getter 
  private List<String> attributes;

  @JsonSetter("restaurantId")
  public void setrestaurantId(String restaurantId) {
    this.restaurantId = restaurantId;
  }

  @JsonSetter("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonSetter("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonSetter("imageUrl")
  public void setrImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @JsonSetter("latitude")
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  @JsonSetter("longitude")
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  @JsonSetter("opensAt")
  public void setOpensAt(String opensAt) {
    this.opensAt = opensAt;
  }

  @JsonSetter("closesAt")
  public void setClosesAt(String closesAt) {
    this.closesAt = closesAt;
  }

  @JsonSetter("attributes")
  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }
}


