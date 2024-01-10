package com.example.coursservice.service;

import com.example.coursservice.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {
    @Autowired
    private CoursRepository coursRepository;

    // Méthodes du service
}

