package com.devtalles.estructurasdedatos.iteradores.listiterators;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Jose", "Miguel", "Carlos"));

        System.out.println("names = " + names);

        addName(names, "Gabriel");

        readNames(names);

        updateName(names, "Ana", "Miguel");

        readNames(names);

        removeName(names, "Carlos");

        readNames(names);
    }

    public static void addName(List<String> names, String newName){
        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.equals("Jose")) {
                iterator.add(newName);
                break;
            }
        }
        System.out.println("Agregado nombre: " + newName);
    }

    public static void updateName(List<String> names, String newName, String oldName){
        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals(oldName)) {
                iterator.set(newName);
                break;
            }
        }
        System.out.println("Se actualizo el nombre: " + oldName + " por: " + newName);
    }

    public static void removeName(List<String> names, String nameToDelete){
        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals(nameToDelete)) {
                iterator.remove();
                break;
            }
        }
        System.out.println("Se elimino el nombre: " + nameToDelete);
    }

    public static void readNames(List<String> names){
        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
