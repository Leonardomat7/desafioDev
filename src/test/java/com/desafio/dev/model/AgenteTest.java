package com.desafio.dev.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AgenteTest {

    @InjectMocks
    private Agente agente;

    @Mock
    private List<Regiao> regioes;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetId() {
        Long idSimulado = 123L;
        agente.setId(idSimulado);
        assertEquals(idSimulado, agente.getId());
    }

    @Test
    public void testSetId() {
        Long idSimulado = 456L;
        agente.setId(idSimulado);
        assertEquals(idSimulado, agente.getId());
    }


    @Test
    public void testGetCodigo() {
        agente.setCodigo(123);
        assertEquals(123, agente.getCodigo());
    }

    @Test
    public void testGetData() {
        agente.setData("2023-09-11");
        assertEquals("2023-09-11", agente.getData());
    }

    @Test
    public void testGetRegioes() {
        List<Regiao> regioesSimuladas = new ArrayList<>();
        regioesSimuladas.add(new Regiao());
        regioesSimuladas.add(new Regiao());

        when(regioes.size()).thenReturn(2);
        when(regioes.get(0)).thenReturn(regioesSimuladas.get(0));
        when(regioes.get(1)).thenReturn(regioesSimuladas.get(1));

        agente.setRegioes(regioesSimuladas);

        assertEquals(2, agente.getRegioes().size());
    }
}
