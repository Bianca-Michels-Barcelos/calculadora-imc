package com.bianca;

public class CalculadoraImc {
    private String nome;
    private double altura;
    private double peso;

    public CalculadoraImc(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    private double calcularImc() {
        return peso / (altura * altura);
    }

    public void mostrarImc() {
        double imc = calcularImc();
        System.out.printf("""
                O IMC de %s é: %f.
                %n""", nome, imc);
    }
}


