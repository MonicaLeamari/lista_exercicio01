package org.example.exercicio7;

public class Multiplo {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 ==0){
                int divisao = i / 2;
                double resultado = i / 2.0;
                System.out.println("A divisão em Int " + divisao + " e divisão em double " + resultado);
            }
        }
    }
}
