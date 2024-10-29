package org.Scanner;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        String user = "admin";
        String password = "1234";
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        while (contador < 3) {
            System.out.println("Nombre de usuario: ");
            String nombre = scanner.nextLine();


            System.out.println("Contraseña: ");
            String contrasenya = scanner.nextLine();

            if ((nombre.equals(user)) && (contrasenya.equals(password))) {

                System.out.println("Usuario y contraseña son correctos");

                break;
            } else {
                System.out.println("Usuario y/o contraseña inválido");
            }
            contador++;
        }


        scanner.close();
    }




}


