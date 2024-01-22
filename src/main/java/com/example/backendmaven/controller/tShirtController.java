package com.example.backendmaven.controller;

import com.example.backendmaven.service.tShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tShirtController {

    @Autowired
    private tShirtService tShirtService;
}
