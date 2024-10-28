package org.example.basics;

public class Arrays {
    public static void main(String[] args) {
        //definir un array de 5 numeros y un array de 5 ciudades
        int[] numeros = {15, 20, 35, 40, 50};
        String[] ciudades = {"malaga", "madrid", "barcelona", "granada", "alicante"};

        for (int numero : numeros) {
            System.out.println("numeros :" + numero);

        }
        for (String ciudad : ciudades) {
            System.out.println("ciudad : " + ciudad);
        }
    }
}
