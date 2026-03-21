package ProyectoFinal;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Duna", "Fiat", 2015, CarType.SPORTS);
        Vehicle myElectricCar = new ElectricCar("Model 3", "Tesla", 2025, CarType.SEDAN, 50);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar)myElectricCar).chargeBattery();

        System.out.println(myCar.toString());
        System.out.println(myElectricCar.toString());
    }
}
