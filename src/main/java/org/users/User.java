package org.users;

public class User {
    private String name;
    private String apellido;

    public User(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }
    public String printFullName(){
        System.out.println(this.name+ " "+ this.apellido);
        return "";
    }
}

