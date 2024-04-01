package com.bianca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = s.nextLine();

        System.out.println("Digite a sua altura: ");
        double altura = s.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = s.nextDouble();

        CalculadoraImc imc = new CalculadoraImc(nome, altura, peso);
        imc.mostrarImc();
    }
}