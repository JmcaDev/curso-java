package ProyectoFinal;

public class Car extends Vehicle{
    private CarType carType;

    public Car(String model, String brand, int year, CarType carType) {
        super(model, brand, year);
        this.carType = carType;
    }

    @Override
    public void start() {
        System.out.println("El auto arranco");
    }

    @Override
    public String toString() {
        return "ProyectoFinal.Car{" +
                "carType=" + carType +
                '}' + super.toString();
    }
}
