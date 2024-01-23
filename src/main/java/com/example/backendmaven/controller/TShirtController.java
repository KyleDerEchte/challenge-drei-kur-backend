package com.example.backendmaven.controller;

import com.example.backendmaven.service.TShirtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TShirtController {
    private final TShirtService tShirtService;
}
