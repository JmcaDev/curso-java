package com.devtalles.proyecto.task;

import com.devtalles.proyecto.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PersonSaver {
    public static void main(String[] args) {
        Person person1 = new Person("Jose", 25, true, Arrays.asList("Correr", "Programar", "Leer", "Estudiar"));
        Person person2 = new Person("Fernando", 30, false, Arrays.asList("Correr", "Estudiar", "Tenis"));

        List<Person> people = Arrays.asList(person1, person2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(people, writer);
            System.out.println("Informacion guardada exitosamente");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
