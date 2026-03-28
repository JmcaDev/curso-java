package com.devtalles.estructurasdedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear Lista
        List<String> students = new ArrayList<>();

        //Añadir datos al final
        students.add("Jose");
        students.add("Miguel");
        students.add("Ana");
        students.add("María");

        //Añadir dato en lugar especifico
        students.add(2, "Fernando");

        //Imprimir datos
        System.out.println(students);

        //Obtener dato de un index especifico
        System.out.println(students.get(0));

        //Eliminando datos de un index especifico
        System.out.println(students.remove(1));
        System.out.println(students);

        //Reemplazando dato de un index especifico
        System.out.println(students.set(0, "Marcelo"));
        System.out.println(students);

        //Buscar un dato
        System.out.println(students.contains("Marcelo"));
    }
}
