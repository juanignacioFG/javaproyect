package org.example.basics;

public class PrimitiveTypes {
    public static void main(String[] args) {
        boolean isActive = true;
        System.out.println(isActive);
        byte primer = 0;
        System.out.println(primer);
        short corto = 66;
        System.out.println(corto);
        int variable = 455;
        System.out.println(variable);
        long largo = 3243324;
        System.out.println(largo);
        double doble = 34.56;
        System.out.println(doble);
        float flotante = 42.34f;
        System.out.println(flotante);
        char letras = 'S';
        System.out.println(letras);

        String name = "sergi";

        String apellido = new String("virgy");

        String fullname = name + " " + apellido;

        System.out.println(fullname);

        if (name.equals("sergi")) {
            System.out.println("el nombre es sergi");
        }

    }
}
