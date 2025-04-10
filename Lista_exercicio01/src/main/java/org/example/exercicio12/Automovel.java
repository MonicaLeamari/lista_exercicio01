package org.example.exercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automovel {
    public static void main(String[] args) {
        // - um motorista monitorou vários tanques cheios de gasolinas: quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
        // - receber quilometros dirigidos e os litros de gasolina consumidos para cada tanque cheio.
        // - deve mostrar: calcular e exibir o consumo em quilometro/litros para cada tanque cheio, imprimir a quilometragem combinada e a soma total de litros de combustíveis consumidos até este ponto.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de automóveis: ");
        int qtdTanques = scanner.nextInt();


        List<Integer> quilometroPercorrido = new ArrayList<>();
        List<Integer> qtdLitro = new ArrayList<>();

        for (int i = 0; i < qtdTanques ; i++) {
            System.out.println("Digite os quilometros dirigidos: ");
            quilometroPercorrido.add(scanner.nextInt());

            System.out.println("Digite os litros de gasolina consumidos: ");
            qtdLitro.add(scanner.nextInt());

            System.out.println("Você gastou uma quantidade de quilometros por litro de: " + (double)quilometroPercorrido.get(i) / qtdLitro.get(i));
        }

        int soma = 0;
        for (Integer i : quilometroPercorrido) {
           soma = i + soma;

        }

        int somaLitro = 0;
        for (Integer j : qtdLitro) {
            somaLitro = j + somaLitro;
        }

        System.out.println("A média dos litros e quilometros é: " + (double)soma / somaLitro);




    }
}
