import java.util.ArrayList;
import java.util.List;

public class Showroom {
    private List<Vehicle> vehicles;

    public Showroom() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }
}

