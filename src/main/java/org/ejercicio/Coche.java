package org.ejercicio;

public class Coche {

    private String marca;
    private String modelo;
    private int year;
    private double kilometraje;

    public Coche(String marca,String modelo,int year){

        this.marca = marca ;
        this.modelo = modelo;
        this.year = year ;
    }
    public  double conducir (double kl){

        return this.kilometraje += kl;

    }

    public String mostrarInformacion () {

        return marca + " " + modelo + " " + year + " " + kilometraje + " ";

    }


}
