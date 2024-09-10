package com.exampleh2.h2demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    private String getAllStudent() {
        return "LLEGO";
    }
}
