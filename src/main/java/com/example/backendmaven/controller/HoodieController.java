package com.example.backendmaven.controller;

import com.example.backendmaven.service.HoodieService;
import com.example.backendmaven.service.TShirtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HoodieController {
    private final HoodieService hoodieService;



}
