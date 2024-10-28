package org.example;

public class Condicional {
    public static void main(String[] args) {


        boolean isActive = true;


        if (isActive) {
            System.out.println("el usuario esta activo");

        } else {
            System.out.println("no esta activo");
        }


        //variable edad usuario con la minima memoria posible
        byte edad = 19;

        if (edad >= 18) {
            System.out.println("es mayor de 18");
        } else {
            System.out.println("no es mayor de 18");
        }
//imprimir si el usuario es 18 o +
//imprimir si el usuario es 17 o -
    }
}
