package com.devtalles.estructurasdedatos.map.hashmap;

import java.util.*;

public class Person {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap();

        Person person1 = new Person("Jose", "123");
        Person person2 = new Person("Maria", "456");
        Person person3 = new Person("Maria2", "456");
        Person person4 = new Person("Maria2", "456");

        //Create
        persons.put(person1.dni, person1);
        persons.put(person2.dni, person2);
        persons.put(person3.dni, person3);
        persons.put(person4.dni, person4);

        //Read
        System.out.println(persons);

        //Delete
        persons.remove(person2.dni);
        System.out.println(persons);

        //Update
        persons.put(person3.dni, new Person("Gabriel", "999"));

        System.out.println(persons);
    }
}
