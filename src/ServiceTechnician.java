public class ServiceTechnician {
  private String name;
  private String employeeId;

  public ServiceTechnician(String name, String employeeId) {
    this.name = name;
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public void repairVehicle(Vehicle vehicle) {
    // code to repair the vehicle
  }
}
