package com.vaccinate.vaccinatebackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/vaccinate/api")
public class LoginController {

    @PostMapping(value = "/login")
    ResponseEntity<String> login(){

    }
}
