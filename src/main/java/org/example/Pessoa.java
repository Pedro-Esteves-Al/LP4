package org.example;

public class Pessoa {
    private double peso;
    private double altura;
    private String sexo;

    public double getPeso() {
        return peso;
    }

    public Pessoa(double peso, double altura, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String calcularImc(){
        double imc = this.peso/ (this.altura*this.altura);
        if (this.sexo.equals("F")) {
            if (imc < 19.1f) {
                return "abaixo do peso";
            } else if (imc < 25.8f){
                return "no peso normal";
            } else if (imc < 27.3f) {
                return "marginalmente acima do peso";
            } else if (imc < 32.3f) {
                return "acima do peso ideal";
            } else {
                return "obeso";
            }
        } else {
            if (imc < 20.6f) {
                return "abaixo do peso";
            } else if (imc < 26.3f){
                return "no peso normal";
            } else if (imc < 27.7f) {
                return "marginalmente acima do peso";
            } else if (imc < 31.0f) {
                return "acima do peso ideal";
            } else {
                return "obeso";
            }
        }
    }
}
