package ProyectoFinal;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String model, String brand, int year, CarType carType, int batteryLevel) {
        super(model, brand, year, carType);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("El auto electrico esta encendido");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("La bateria esta cargada al 100%");
    }

    @Override
    public String toString() {
        return "ProyectoFinal.ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}
