package relaciones;

public class Person {
    public void calculateSum(Calculator calculator ){
        int result = calculator.add(1,2);
        System.out.println("Suma = " + result);
    }
}
