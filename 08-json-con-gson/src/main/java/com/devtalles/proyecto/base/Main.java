package com.devtalles.proyecto.base;

import com.devtalles.proyecto.Person;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Juan", 25, true);

        Gson gson = new Gson();

        String json = gson.toJson(person);

        System.out.println(json);

        json = "{\"name\":\"Jose\",\"age\":25,\"student\":false}";

        Person person2 = gson.fromJson(json, Person.class);

        System.out.println(person2.toString());

    }
}
