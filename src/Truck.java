public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void start() {
        System.out.println("Starting truck...");
    }

    public void stop() {
        System.out.println("Stopping truck...");
    }
}