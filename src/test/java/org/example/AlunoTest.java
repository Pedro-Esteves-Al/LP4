package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    Aluno aluno;

    @BeforeEach
    public void setup() {
        aluno = new Aluno();
    }

    @Test
    public void deveTestarReprovacaoPorFrequencia() {
        aluno.setFrequencia(74);
        assertEquals("Reprovado por frequência",aluno.informaEstadoAluno());
    }

    @Test
    public void deveTestarReprovacaoDireta() {
        aluno.setFrequencia(75);
        aluno.setNota1(30);
        aluno.setNota2(29);
        assertEquals("Reprovado direto por nota",aluno.informaEstadoAluno());
    }

    @Test
    public void deveTestarProvaFinal() {
        aluno.setFrequencia(75);
        aluno.setNota1(60);
        aluno.setNota2(59);
        assertEquals("prova final",aluno.informaEstadoAluno());
    }

    @Test
    public void deveTestarAprovado() {
        aluno.setFrequencia(75);
        aluno.setNota1(90);
        aluno.setNota2(89);
        assertEquals("Aprovado",aluno.informaEstadoAluno());
    }

    @Test
    public void deveTestarAprovadoComHonraAoMerito() {
        aluno.setFrequencia(75);
        aluno.setNota1(90);
        aluno.setNota2(90);
        assertEquals("Aprovado com honra ao mérito",aluno.informaEstadoAluno());
    }

}