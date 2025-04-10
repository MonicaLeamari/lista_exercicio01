package org.example.exercicio5;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 8){
            System.out.println("Menu: ");
            System.out.println("Opção 1");
            System.out.println("Opção 2");
            System.out.println("Opção 3");
            System.out.println("Opção 4");
            System.out.println("Opção 5");
            System.out.println("Opção 6");
            System.out.println("Opção 7");
            System.out.println("Opção 8 - Sair");
            System.out.println("-------------------------");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Hoje é segunda - feira");
                    break;
                case 2:
                    System.out.println("Hoje é terça - feira");
                    break;
                case 3:
                    System.out.println("Hoje é quarta - feira");
                    break;
                case 4:
                    System.out.println("Hoje é quinta - feira");
                    break;
                case 5:
                    System.out.println("Hoje é sexta - feira");
                    break;
                case 6:
                    System.out.println("Hoje é sábado");
                    break;
                case 7:
                    System.out.println("Hoje é domingo");
                    break;
                case 8:
                    break;
            }

        }


    }
}
