package org.example.exercicio4;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma distância em milhas: ");
        Double distancia = scanner.nextDouble();
        Double conversao = distancia * 1.609;

        System.out.println("A distância " + distancia + " na conversão para quilômetros será: " + conversao);


    }
}
