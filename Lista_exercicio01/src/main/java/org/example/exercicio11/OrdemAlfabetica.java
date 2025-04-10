package org.example.exercicio11;

import java.util.Scanner;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0){
            System.out.println("A ordem alfabética é: " + palavra1 + " , " + palavra2);
        } else if (comparacao > 0) {
            System.out.println("A ordem alfabética é: " + palavra2 + " , " + palavra1);
        }else {
            System.out.println("As duas palavras começam com a mesma letra do alfabeto");
        }

        if (palavra1.length() > palavra2.length()){
            System.out.println("A palavra com maior números de caracteres é: " + palavra1);
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A palavra com maior números de caracteres é: " + palavra2);
        } else {
            System.out.println("As duas palavras possuem o mesmo número de caracteres");
        }

    }
}
