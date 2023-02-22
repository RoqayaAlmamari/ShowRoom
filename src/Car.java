public class Car extends Vehicle {
    private int numDoors;

    public Car(String color, String model, int year, int numDoors) {
        super(color, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void start() {
        System.out.println("Starting car Here ...");

    }

    public void stop() {
        System.out.println("Stopping car...");
    }
}