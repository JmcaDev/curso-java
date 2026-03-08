package Inmutabilidad;

public class Main {
    public static void main(String[] args) {
        House house = new House(2,3,10);
        System.out.println("House.getDoors() = " + house.getDoors());
        System.out.println(house.toString());
    }
}
