public class Motorcycle extends Vehicle{

    private boolean hasSidecar;
    private Engine engine;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        this.engine = new Engine();
    }

    public void popWheelie(){
        System.out.println("La moto esta haciendo un caballito");
    }

    public void start() {
        System.out.println("La moto esta encendida");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
