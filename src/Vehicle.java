public abstract class Vehicle {
    private String color;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();

    public abstract void stop();
}





