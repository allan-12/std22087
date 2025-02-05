package com.example.demo.endpoint.rest.controller.health;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
  @GetMapping("/hello")
  public Map<String, String> sayHello() {
    return Map.of("message", "Hello Wordl");
  }
}
