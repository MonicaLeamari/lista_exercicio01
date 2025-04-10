package org.example.exercicio9;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio (r): ");
        double raio = scanner.nextDouble();

        double a = 3.14 * Math.pow(raio, 2);
        long arredondado = Math.round(a);
        System.out.println("A área de um círculo é: " + arredondado);

    }
}
