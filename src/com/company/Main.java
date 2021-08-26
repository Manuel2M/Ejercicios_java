package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Animal animal = new Animal();
    animal.saludar();
    animal.setEdad(3);
    animal.setNombre("Chiqui");
    animal.setPeso(20.4);
    animal.setEsMacho(true);
    animal.setInicial('C');

        System.out.println("su edad es: "+animal.getEdad());
        animal.decirEdad();

    Animal animal2 = new Animal(2,"Marrano",20.4,true,'C') ;
    animal2.decirEdad();
    animal2.decirNombreEInicial();
    animal2.isEsMacho();
    animal2.mostrarGenero();

    Gato gato = new Gato(3,"Narciso",4.1,false,'N',"angora","Manuel","blanco");
    gato.decirNombreEInicial();
    gato.raza();
    }
}
