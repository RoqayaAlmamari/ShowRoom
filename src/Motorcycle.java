public class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(String make, String model, int year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void start() {
        System.out.println("Starting motorcycle...");
    }

    public void stop() {
        System.out.println("Stopping motorcycle...");
    }
}
