package com.example.backendmaven.service;

import com.example.backendmaven.repository.HoodieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HoodieService {


    private final HoodieRepository hoodieRepository;
}
