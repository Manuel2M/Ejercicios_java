package com.company;

//import static com.sun.glass.ui.monocle.LinuxInputDevice.system;

public class Animal {
    //definición de atributos
    private int edad;
    private String nombre;
    private double peso;
    private boolean esMacho;
    private char inicial;

    //constructor por defecto
    public Animal(){

    }
    //constructor con parametros
    public Animal(int edad, String nombre, double peso, boolean esMacho, char inicial){
        this.edad=edad;
        this.nombre=nombre;
        this.peso=peso;
        this.esMacho=esMacho;
        this.inicial=inicial;
    }
    //getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isEsMacho() {
        return esMacho;
    }

    public char getInicial() {
        return inicial;
    }

    //setter
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEsMacho(boolean esMacho) {
        this.esMacho = esMacho;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    //metodos de la clase animal
    public void decirEdad(){

        System.out.println("Su edad es: "+edad);
    }
    public void decirNombreEInicial(){
        System.out.println("Su nombre es; "+nombre);
        System.out.println("y su inicial es: "+inicial);
    }
    public void mostrarPeso(){
        System.out.println("su peso es: "+peso);
    }
    public void mostrarGenero(){
        if (esMacho) {
        System.out.println("El animal es macho");
            }
        else{
            System.out.println("el animal es hembra");
        }


    }
    public void saludar(){
        System.out.println("hola como estas");
    }

}
