import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Introduccion
        Integer[] numbers = {1,2,3} ;

        System.out.println(numbers[0]);

        numbers[0] = 100;

        System.out.println(numbers[0]);

        int[] fixedArray = new int[1000];

        System.out.println("Dimension: " + fixedArray.length);

        //Dinamicas
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        System.out.println("numbers2 = " + numbers2);
        */

        int[] numbersPrimitive = {1,2,3,4,5,6,0,9};

        int deletePosition = 2;

        for(int i = deletePosition; i<numbersPrimitive.length - 1; i++){
            numbersPrimitive[i] = numbersPrimitive[i+1];
        }

        numbersPrimitive[numbersPrimitive.length-1] = 0;

        for(int numbers: numbersPrimitive){
            System.out.println(numbers);
        }

        /*
        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;
        int[] newNumbers = new int[numbersPrimitive.length + 1];
        System.arraycopy(numbersPrimitive, 0, newNumbers, 0, numbersPrimitive.length);
        newNumbers[5] = 500;

        Integer[] numbersWrapper = new Integer[5];

        numbersWrapper[0] = 30;
        numbersWrapper[1] = null;

        System.out.println("Tipo Int");
        for(int number: newNumbers){
            System.out.println(number);
        }

        System.out.println("Tipo Integer");
        for(Integer number: numbersWrapper){
            System.out.println(number);
        }
        */

    }
}
