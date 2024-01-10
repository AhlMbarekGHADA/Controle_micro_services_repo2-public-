package com.example.coursservice.controller;

import com.example.coursservice.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    private CoursService coursService;

    // Endpoints du contrôleur
}

