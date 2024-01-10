package com.example.studentservice.controller;

import com.example.accountservice.exception.EtudiantNotFoundException;
import com.example.accountservice.model.EtudiantService;
import com.example.accountservice.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

}
