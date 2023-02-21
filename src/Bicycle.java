public class Bicycle extends Vehicle {
    private int numGears;

    public Bicycle(String make, String model, int year, int numGears) {
        super(make, model, year);
        this.numGears = numGears;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public void start() {
        System.out.println("Starting bicycle...");
    }

    public void stop() {
        System.out.println("Stopping bicycle...");
    }
}
