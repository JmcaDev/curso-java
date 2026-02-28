package bucles;

public class Bucle {
    static void main(String[] args) {

        final int MAX_COUNT = 5;

        //Bucle for
        for(int currentNumber = 1; currentNumber <=MAX_COUNT; currentNumber++){
            System.out.println("i: " + currentNumber);
        }
        System.out.println("Sale");

        //Bucle While
        int counter = 0 ;
        int acumulador = 0;
        while(counter<5){
            System.out.println("Counter: " + counter);
            acumulador= acumulador + counter;
            counter++;
        }
        System.out.println("acumulador = " + acumulador);

        //Bucle do While
        int counter2 = 0;
        do{
            System.out.println("counter2 = " + counter2);
            counter2++;
        }while(counter2<5);
    }
}
