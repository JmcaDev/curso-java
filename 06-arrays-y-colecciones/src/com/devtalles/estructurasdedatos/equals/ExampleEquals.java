package com.devtalles.estructurasdedatos.equals;

public class ExampleEquals {
    public static void main(String[] args) {
        Integer numberA = 128;
        Integer numberB = 128;

        //Se comparan direcciones de memoria
        System.out.println(numberB == numberA);

        //Se compara el dato almacenado
        System.out.println(numberB.equals(numberA));
    }
}
