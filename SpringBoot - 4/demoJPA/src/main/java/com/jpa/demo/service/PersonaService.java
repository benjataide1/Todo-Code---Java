package com.jpa.demo.service;

import com.jpa.demo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private IPersonaRepository personaRepository;

}
