package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        Hello hello = new Hello();

        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);
        hello.getName("Reddy");
    }

}
