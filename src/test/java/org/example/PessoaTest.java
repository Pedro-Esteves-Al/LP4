package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    public void deveTestarMasculinoAbaixoPeso() {
        Pessoa pessoa = new Pessoa(20.5f, 1.0f, "M");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    public void deveTestarMasculinoPesoNormal() {
        Pessoa pessoa = new Pessoa(26.2f, 1.0f, "M");
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    public void deveTestarMasculinoMarginalmenteAcimaPeso() {
        Pessoa pessoa = new Pessoa(27.6f, 1.0f, "M");
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    public void deveTestarMasculinoAcimaPesoIdeal() {
        Pessoa pessoa = new Pessoa(29.9f, 1.0f, "M");
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    public void deveTestarMasculiObeso() {
        Pessoa pessoa = new Pessoa(31.0f, 1.0f, "M");
        assertEquals("obeso", pessoa.calcularImc());
    }

    

    @Test
    public void deveTestarMulherAbaixoPeso() {
        Pessoa pessoa = new Pessoa(19.0f, 1.0f, "F");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }
    @Test
    public void deveTestarMulherPesoNormal() {
        Pessoa pessoa = new Pessoa(25.7f, 1.0f, "F");
        assertEquals("no peso normal", pessoa.calcularImc());
    }
    @Test
    public void deveTestarMulherMarginalmenteAcimaPeso() {
        Pessoa pessoa = new Pessoa(27.2f, 1.0f, "F");
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }
    @Test
    public void deveTestarMulherAcimaPesoIdeal() {
        Pessoa pessoa = new Pessoa(32.2f, 1.0f, "F");
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    public void deveTestarMulherObeso() {
        Pessoa pessoa = new Pessoa(32.3f, 1.0f, "F");
        assertEquals("obeso", pessoa.calcularImc());
    }
}