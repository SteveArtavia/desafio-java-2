package com.example.desafio2.controller;

import com.example.desafio2.dto.FraseDTO;
import com.example.desafio2.model.Frase;
import com.example.desafio2.repository.FraseRepository;
import com.example.desafio2.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {
    //Inyectar dependencia del service
    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO obtenerFrase(){
        return service.obtenerFrase();
    }
}
