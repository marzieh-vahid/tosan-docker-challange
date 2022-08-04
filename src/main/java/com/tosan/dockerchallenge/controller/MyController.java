package com.tosan.dockerchallenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(path = "/helloworld", produces = "application/json")
    public String sayHelloWord() {
        return "Hello Stranger";
    }

    @GetMapping(path = "/helloworld/", produces = "application/json")
    public String sayHello(@RequestBody String name) {
        return "Hello " + name;
    }

    @GetMapping(path = "/author", produces = "application/json")
    public String myNameIs() {
        return "Marzieh Vahid";
    }

}
