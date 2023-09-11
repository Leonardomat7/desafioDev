package com.desafio.dev.service;

import com.desafio.dev.model.Agente;
import com.desafio.dev.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgenteService {

    private final AgenteRepository agenteRepository;

    @Autowired
    public AgenteService(AgenteRepository agenteRepository) {
        this.agenteRepository = agenteRepository;
    }

    public void salvarAgente(Agente agente) {
        agenteRepository.save(agente);
    }
}
