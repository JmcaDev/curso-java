public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);
        vehicle.setYear(2003);

        System.out.println(vehicle.toString());
    }
}