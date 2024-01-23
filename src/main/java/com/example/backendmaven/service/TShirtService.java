package com.example.backendmaven.service;

import com.example.backendmaven.repository.TShirtRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TShirtService {


    private final TShirtRepository tShirtRepository;

}
