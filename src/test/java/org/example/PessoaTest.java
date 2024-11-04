package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    public void deveTestarMasculinoAbaixoPeso() {
        Pessoa pessoa = new Pessoa(20.6f, 1.0f, "M");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }
}