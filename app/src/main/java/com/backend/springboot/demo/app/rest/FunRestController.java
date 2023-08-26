package com.backend.springboot.demo.app.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String getHello() {
//        return "Hello World! This is my first java spring boot app and a hello world request . . .";
        return "Hello World!";

    }
}
