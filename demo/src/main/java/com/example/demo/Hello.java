package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {


    @RequestMapping("/hello")
    public String Hello() {
//        this.name = name;
        return "Hello";
    }

    @RequestMapping("/hello/{name}")
    public String getName(@PathVariable("name") String name1){
        System.out.println("Name: " + name1);
        return "Hello " + name1;
    }

    @RequestMapping("/hello/")
    public String Hello1(){
        return "Hello !!";
    }
}
