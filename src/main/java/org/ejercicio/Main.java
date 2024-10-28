package org.ejercicio;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("opel", "corpsa", 2024);

        System.out.println(coche1.mostrarInformacion());
        coche1.conducir(1000);
        System.out.println(coche1.mostrarInformacion());
    }
}
