package ejemploAbsInterfaces;

public class Main {
    public static void main(String[] args) {
        /*Vehicle vechicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive (){
                System.out.println("Estoy conduciendo");
            }
        };

        System.out.println(vechicle.toString());*/

        Vehicle electric = new ElectricCar("Fiat", "Duna", 2024, Color.RED, VehicleStatus.AVAILABLE, 80);

        System.out.println(electric.toString());
    }
}
