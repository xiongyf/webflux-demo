package com.kevin.webfluxdemo.sys.pojo;

import lombok.Data;

@Data
public class User {

   private String name;

   @Override
   public String toString() {
      return "User{" +
              "name='" + name + '\'' +
              '}';
   }
}
