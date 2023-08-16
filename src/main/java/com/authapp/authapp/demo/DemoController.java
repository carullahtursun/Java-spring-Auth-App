package com.authapp.authapp.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {


    @GetMapping
    public ResponseEntity<String> sayHello(){
        System.out.println("sayHello");
        return ResponseEntity.ok("hello my frends");
    }
}
