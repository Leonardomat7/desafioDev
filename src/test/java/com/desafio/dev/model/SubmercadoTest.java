package com.desafio.dev.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubmercadoTest {

    private Submercado submercado;

    @BeforeEach
    public void setUp() {
        submercado = new Submercado();
    }

    @Test
    public void testGetId() {
        Long id = 1L;
        submercado.setId(id);
        assertEquals(id, submercado.getId());
    }

    @Test
    public void testSetId() {
        Long id = 2L;
        submercado.setId(id);
        assertEquals(id, submercado.getId());
    }

    @Test
    public void testGetValor() {
        Double valor = 10.5;
        submercado.setValor(valor);
        assertEquals(valor, submercado.getValor());
    }

    @Test
    public void testSetValor() {
        Double valor = 20.5;
        submercado.setValor(valor);
        assertEquals(valor, submercado.getValor());
    }
}
