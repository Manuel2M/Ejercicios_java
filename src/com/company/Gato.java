package com.company;

public class Gato extends Animal{
    private String razaDeGato;
    private String dueno;
    private String color;

    //constructor por defecto
    public Gato(){
    super();
    }

    public Gato(int edad,String nombre,double peso,boolean esMacho,char inicial,String razaDeGato,String dueno,String color)  {
    super(edad,nombre,peso,esMacho,inicial);
    this.razaDeGato=razaDeGato;
    this.dueno=dueno;
    this.color=color;
    }

    public void raza(){
        System.out.println("la raza del gato es;"+razaDeGato);
    }


}
