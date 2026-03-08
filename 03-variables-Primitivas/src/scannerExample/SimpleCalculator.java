package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = getNumbers(input, "Ingrese el primer numero: ");

        int second = getNumbers(input, "Ingrese el segundo numero: ");

        printArithmeticOperations(first, second);

        compareNumbers(first, second);
    }

    public static int getNumbers(Scanner input, String message){
        System.out.print(message);
        int number = input.nextInt();
        return number;
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        System.out.println("La suma de a + b es igual a: " + (firstNumber + secondNumber));
        System.out.println("La diferencia de a - b es igual a: " + (firstNumber - secondNumber));
    }

    public static void compareNumbers(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber){
            System.out.println("El primer numero es mayor");
        }else {
            System.out.println("El segundo numero es mayor o igual");
        }
    }
}
