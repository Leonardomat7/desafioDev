package com.desafio.dev.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RegiaoTest {

    private Regiao regiao;

    @BeforeEach
    public void setUp() {
        regiao = new Regiao();
    }

    @Test
    public void testGetId() {
        regiao.setId(1L);
        assertEquals(1L, regiao.getId());
    }

    @Test
    public void testSetId() {
        regiao.setId(2L);
        assertEquals(2L, regiao.getId());
    }

    @Test
    public void testGetSigla() {
        regiao.setSigla("ABC");
        assertEquals("ABC", regiao.getSigla());
    }

    @Test
    public void testSetSigla() {
        regiao.setSigla("XYZ");
        assertEquals("XYZ", regiao.getSigla());
    }

    @Test
    public void testGetGeracao() {
        List<Double> geracao = Arrays.asList(100.0, 200.0, 300.0);
        regiao.setGeracao(geracao);
        assertEquals(geracao, regiao.getGeracao());
    }

    @Test
    public void testSetGeracao() {
        List<Double> geracao = Arrays.asList(400.0, 500.0, 600.0);
        regiao.setGeracao(geracao);
        assertEquals(geracao, regiao.getGeracao());
    }

    @Test
    public void testGetCompra() {
        List<Double> compra = Arrays.asList(10.0, 20.0, 30.0);
        regiao.setCompra(compra);
        assertEquals(compra, regiao.getCompra());
    }

    @Test
    public void testSetCompra() {
        List<Double> compra = Arrays.asList(40.0, 50.0, 60.0);
        regiao.setCompra(compra);
        assertEquals(compra, regiao.getCompra());
    }

    @Test
    public void testGetPrecoMedio() {
        List<Double> precoMedio = Arrays.asList(5.0, 10.0, 15.0);
        regiao.setPrecoMedio(precoMedio);
        assertEquals(precoMedio, regiao.getPrecoMedio());
    }

    @Test
    public void testSetPrecoMedio() {
        List<Double> precoMedio = Arrays.asList(25.0, 30.0, 35.0);
        regiao.setPrecoMedio(precoMedio);
        assertEquals(precoMedio, regiao.getPrecoMedio());
    }
}

