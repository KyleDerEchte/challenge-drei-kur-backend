package com.example.backendmaven.service;

import com.example.backendmaven.repository.tShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tShirtService {

    @Autowired
    private tShirtRepository tShirtRepository;

}
