package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean repeat;

        do{
            System.out.print("Ingrese la edad:");
            int age = input.nextInt();

            System.out.println("Ingrese tres calificaciones");

            System.out.print("Ingrese la primera calificacion:");
            int grade1 = input.nextInt();

            System.out.print("Ingrese la segunda calificacion:");
            int grade2 = input.nextInt();

            System.out.print("Ingrese la tercera calificacion:");
            int grade3 = input.nextInt();

            int sum = grade1 + grade2 + grade3;
            double average = sum / 3.0;

            if(average >=6){
                System.out.println("Aprobado " + "Edad: "+ age);
            }else{
                System.out.println("Reprobado " + "Edad: "+ age);
            }

            System.out.print("¿Desea ingresar nuevos datos? (1 para si, 0 para no):");
            int option = input.nextInt();

            repeat = option == 1;


        }while(repeat);

        System.out.println("Programa finalizado");
        input.close();
    }
}
