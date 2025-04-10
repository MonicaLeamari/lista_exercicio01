package org.example.exercicio10;

import java.util.Scanner;

public class ContagemLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String frase = scanner.nextLine();

        frase = frase.toLowerCase();

        int contarVogais = 0;
        int consoante = 0;
        int espaco = 0;

        for (int i = 0; i < frase.length(); i++) {
            char vogais = frase.charAt(i);

            if (vogais == 'a' || vogais == 'e' || vogais == 'i' || vogais == 'o' || vogais == 'u'){
                contarVogais++;
            }else if (vogais == ' '){
                espaco++;
            }
            else{
                consoante++;
            }


        }

        System.out.println("O número de vogais: " + contarVogais + " ,o número de consoantes é: " + consoante + " e o número de espaços: " + espaco);



    }
}
