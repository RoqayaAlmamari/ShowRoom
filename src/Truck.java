public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String color, String model, int year, int cargoCapacity) {
        super(color, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void start() {
        System.out.println("Here..");
        System.out.println("Starting a truck...");
    }

    public void stop() {
        System.out.println("Stopping a truck...");
    }
}