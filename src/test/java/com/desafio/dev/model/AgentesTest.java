package com.desafio.dev.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgentesTest {

    private Agentes agentes;

    @BeforeEach
    public void setUp() {
        agentes = new Agentes();
    }
    @Test
    public void testGetAgentes() {
        List<Agente> agentesSimulados = new ArrayList<>();
        agentesSimulados.add(mock(Agente.class));
        agentesSimulados.add(mock(Agente.class));

        agentes.setAgentes(agentesSimulados);

        assertEquals(agentesSimulados, agentes.getAgentes());
    }

    @Test
    public void testSetAgentes() {
        List<Agente> agentesSimulados = new ArrayList<>();
        agentesSimulados.add(mock(Agente.class));
        agentesSimulados.add(mock(Agente.class));

        agentes.setAgentes(agentesSimulados);

        assertEquals(agentesSimulados, agentes.getAgentes());
    }
}
