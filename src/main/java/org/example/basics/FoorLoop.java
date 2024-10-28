package org.example.basics;

public class FoorLoop {
    public static void main(String[] args) {

        //imprimir por consola numeros del 1 al 10 usando un for

        int numero = 10;

        for (int i = 0; i < numero; i++) {
            System.out.println(numero + "x" + i + "=" + (numero - i));
        }
        //imprimir solo numeros pares del 5 a 10

        for (int i = 5; i < 11; i++) {
            System.out.println("number : " + i);
        }
        for (int i = 5; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("es un numero par : " + i);
            }

        }
        //imprimir los numeros impares del 5 al 10 usando while

        int i = 5;
        while (i <= 10) {
            if (i % 2 != 0) {
            }
            System.out.println("es un numero impar " + i);


        } i++;
    }

}
