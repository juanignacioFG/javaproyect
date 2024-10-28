package org.users;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("juan", "fauro");
        User user2 = new User("alba", "lopez");
        User user3 = new User("natalia", "gomez");

        System.out.println(user1.printFullName());

        //con un bucle imprimir los fullname de 3 usuarios

        User[] users = {user1, user2, user3};
        for (User user : users) {
            System.out.println(user.printFullName());

        }
    }

}
