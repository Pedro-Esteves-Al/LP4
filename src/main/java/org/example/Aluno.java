package org.example;

public class Aluno {
    private double nota1;
    private double nota2;
    private double frequencia;

    Aluno aluno () {
        this.nota1 = 0;
        this.nota2 = 0;
        this.frequencia = 0;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double calculaMedia(){
        return (this.nota1+this.nota2)/2;
    }
    public String informaEstadoAluno(){
        if (this.frequencia < 75) {
            return "Reprovado por frequência";
        } else {
            double media;
            media = calculaMedia();
            if (media < 30) {
                return "Reprovado direto por nota";
            } else if (media < 60) {
                return "prova final";
            } else if (media < 90) {
                return "Aprovado";
            } else {
                return "Aprovado com honra ao mérito";
            }
        }
    }
}
