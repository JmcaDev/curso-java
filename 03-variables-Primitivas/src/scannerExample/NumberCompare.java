package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int firstNumber = input.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;

        System.out.println("La suma de a + b es igual a: " + sum);
        System.out.println("La diferencia de a - b es igual a: " + difference);

        if(firstNumber > secondNumber){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El segundo numero es mayor o igual");
        }

        System.out.println("Fin de la aplicacion");

        input.close();
    }
}
