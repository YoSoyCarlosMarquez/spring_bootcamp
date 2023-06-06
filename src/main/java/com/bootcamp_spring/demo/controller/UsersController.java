package com.bootcamp_spring.demo.controller;

import com.bootcamp_spring.demo.dto.UsersDTO;
import com.bootcamp_spring.demo.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("/hello-world/{nombre}")
    public String helloWorldPathVariable(
            @PathVariable(name = "nombre") String nombre) {
        return String.format("Hello world %s!", nombre);
    }

    @GetMapping("/hello-world")
    public String helloWorldQueryParam(
            @RequestParam(name = "nombre") String nombre) {
        return String.format("Hello world %s!", nombre);
    }

    @GetMapping("/get/{id}")
    public UsersDTO getUserById(
            @PathVariable(name = "id") Long id) {
        return userService.getUserById(id);
    }

}
