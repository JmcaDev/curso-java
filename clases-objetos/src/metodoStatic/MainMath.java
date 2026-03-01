package metodoStatic;

public class MainMath {
    public static void main(String[] args) {
        int result = MathExample.add(2,2);

        System.out.println("result = " + result);

        result = MathExample.subtract(10, 4);
        System.out.println("result = " + result);

        result = MathExample.subtract(20, 4);
        System.out.println("result = " + result);
    }
}
