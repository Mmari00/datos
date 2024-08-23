package com.example;

public class Main {
    public static void main(String[] args) {
        

        //Declaración de variables
        int edad = 17;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true;
        String numeroStr = "12345678";
        String decimalStr = "3.14159";


        //Clases envolventes

        //Casteo de las variables
        int enteroSala = (int) salario;
        System.out.println("Variable 'salario' pasada a entero: " + enteroSala);
        long largoCodigo = (long) codigoPostal;
        System.out.println("Variable 'codigoPostal' pasada a long: " + largoCodigo);
        System.out.println("¿Qué sucede con la información al realizar el casteado? R/= Cuando realizamos el casteado la infomación cambiará de su estado de presentación, o sea, si al principio se tenía un tipo de variable con el dato; al aplicar el casteado se cambia el tipo de variable al dato que se desea cambiar.");

        //Parseo de las variables
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Variable 'numeroStr' pasada a entero: " + numeroInt );
        double decimalValor= Double.parseDouble(decimalStr);
        System.out.println("Variable 'decimalStr' pasada a double: " + decimalValor);


    }
}