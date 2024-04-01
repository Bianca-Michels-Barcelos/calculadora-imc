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

    private String verificarGrauImc(double imc) {
        if (imc < 18.5) {
            return "0 - Magreza";
        } else if (imc < 25) {
            return "0 - Normal";
        } else if (imc < 30) {
            return "1 - Sobrepeso";
        } else if (imc < 40) {
            return "2 - Obesidade";
        } else {
            return "3 - Obesidade Grave";
        }
    }

    public void mostrarImc() {
        double imc = calcularImc();
        String grauImc = verificarGrauImc(imc);
        System.out.printf("""
                O IMC de %s é: %f.%n
                Classificado no grau: %s.""", nome, imc, grauImc);
    }
}


