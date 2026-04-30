package com.devtalles.exception.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {

    private List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String name, int age, String id) throws DuplicateStudentException {

        validateStudent(name,age,id);

        if(isStudentRegistered(id)){
            throw new DuplicateStudentException("El estudiante que intenta registrar ya existe");
        }

        this.students.add(new Student(name, age, id));

        System.out.println("Estudiante registrado correctamente");
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if(id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("El id no puede estar vacio");
        }

        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getId().equals(id)){
                iterator.remove();
                System.out.println("Estudiante eliminado correctamente");
                return;
            }
        }

        throw new StudentNotFoundException("El estudiante no existe");
    }

    public boolean isStudentRegistered(String id){
        for(Student student: students){
            if(student.getId().equals(id)){
                return true;
            }
        }
        return  false;
    }

    public void validateStudent(String name, int age, String id){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacio");
        }

        if(id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("El id no puede estar vacio");
        }

        if(age < 17 || age > 100){
            throw new IllegalArgumentException("La edad tiene que estar entre 17 y 100");
        }

        if(!id.matches("^[A-Z]\\d{5}$")){
            throw  new IllegalArgumentException("El id no cumple con un id de estudiante");
        }
    }

    public static void main(String[] args) {
        StudentRegistrationSystem system = new StudentRegistrationSystem();

        try {
            system.registerStudent("Horacio", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerStudent("Jose", 15, "A62345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerStudent("Miguel", 25, "c3345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerStudent("Horacio", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.registerStudent("", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            system.removeStudent("A99999");
        } catch (StudentNotFoundException e) {
            System.out.println("Redireccionar al usuario para corregir el error");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
