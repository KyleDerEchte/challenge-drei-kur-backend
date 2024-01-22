package com.example.backendmaven.service;

import com.example.backendmaven.repository.HoodieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoodieService {

    @Autowired
    private HoodieRepository hoodieRepository;
}
