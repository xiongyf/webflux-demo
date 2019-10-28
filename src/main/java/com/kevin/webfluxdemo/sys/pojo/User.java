package com.kevin.webfluxdemo.sys.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class User {

    @NotBlank(message = "User name can't be null")
    private String name;

    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "Incorrect phone number format")
    private String phone;

}
