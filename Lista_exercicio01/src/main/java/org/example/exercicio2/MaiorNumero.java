package org.example.exercicio2;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("O número maior é o: " + num1);
        }else {
            System.out.println("O número maio é o: " + num2);
        }
    }

}
