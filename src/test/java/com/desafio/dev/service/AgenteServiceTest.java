package com.desafio.dev.service;

import com.desafio.dev.model.Agente;
import com.desafio.dev.repository.AgenteRepository;
import com.desafio.dev.service.AgenteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class AgenteServiceTest {

    @Mock
    private AgenteRepository agenteRepository;

    @InjectMocks
    private AgenteService agenteService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarAgente() {
        Agente agente = new Agente();
        agenteService.salvarAgente(agente);
        verify(agenteRepository, times(1)).save(agente);
    }
}
