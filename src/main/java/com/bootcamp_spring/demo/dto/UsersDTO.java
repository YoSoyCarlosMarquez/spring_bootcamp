package com.bootcamp_spring.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersDTO {

    Long id;

    String name;

    String lastName;

    Integer state;

}
