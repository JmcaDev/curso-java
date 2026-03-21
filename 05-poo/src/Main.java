public class Main {

    public static void main(String[] args) {

        /*Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);
        vehicle.setYear(2003);

        System.out.println(vehicle.toString());*/

        Vehicle myCar = new Car("Toyota", "Corolla", 2024, 4);

        Vehicle myMotorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        ((Car)myCar).start();
        ((Motorcycle)myMotorcycle).start();

        printVehicle(myMotorcycle);
        printVehicle(myCar);

        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
    }


    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}