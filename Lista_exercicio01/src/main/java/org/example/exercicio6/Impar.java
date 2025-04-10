package org.example.exercicio6;

public class Impar {
    public static void main(String[] args) {

        int produtoInt = 1;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0){
                produtoInt *= i;
            }
        }

    System.out.println("O produto dos números impares entre 15 e 30 é: " + produtoInt + " (Int)");

        float produtoFloat = 1f;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0){
                produtoFloat *= i;
            }
        }

        System.out.println("O produto dos números impares entre 15 e 30 é: " + produtoFloat + " (Float)");

    }
}
