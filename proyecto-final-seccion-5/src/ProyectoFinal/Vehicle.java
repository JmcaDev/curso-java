package ProyectoFinal;

public abstract class Vehicle {
    private String model;
    private String brand;
    private int year;

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void start();

    public void stop(){
        System.out.println("El vehiculo esta detenido");
    }

    @Override
    public String toString() {
        return "ProyectoFinal.Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
