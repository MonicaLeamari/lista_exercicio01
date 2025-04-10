package org.example.exercicio8;

import java.util.Scanner;

public class PalavraInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String frase = new StringBuilder(palavra).reverse().toString();
        if (palavra.equals(frase)){
            System.out.println("A palavra ao contrário será: " + frase);
        }else {
            System.out.println("Esta palavra não é igual de traz pra frente!");
        }



    }
}
