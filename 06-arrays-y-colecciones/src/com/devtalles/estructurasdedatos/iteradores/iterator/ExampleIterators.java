package com.devtalles.estructurasdedatos.iteradores.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Jose");
        names.add("Miguel");
        names.add("Carlos");

        System.out.println(names);

        //Iteradores
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.startsWith("J") || name.startsWith("C")) {
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}
