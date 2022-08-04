package com.tosan.dockerchallenge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class MyController {

    @GetMapping(path = "/helloworld", produces = "application/json")
    public String HelloWorld() {
        log.info(new Date() + ".....helloworld service is up....");
        return "Hello Stranger";
    }

    @ResponseBody
    @GetMapping(path = "/say/helloworld", produces = "application/json")
    public String sayHello(@RequestParam String name) {
        log.info(new Date() + ".....now say hello service is up.....");
        log.info(new Date() + ".....the entered name in Request is:... " + name);
        return "Hello " + name;
    }

    @GetMapping(path = "/author", produces = "application/json")
    public String myNameIs() {
        log.info(new Date() + ".....my name is.....");
        return "Marzieh Vahid";
    }

}
