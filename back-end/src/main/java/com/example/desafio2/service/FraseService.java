package com.example.desafio2.service;

import com.example.desafio2.dto.FraseDTO;
import com.example.desafio2.model.Frase;
import com.example.desafio2.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFrase(){
        Frase frase = repository.obtenerFrase();
        return new FraseDTO(frase.getFrase(),frase.getPersonaje(),frase.getTitulo(), frase.getPoster());
    }

}
