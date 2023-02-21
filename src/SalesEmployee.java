public class SalesEmployee {
  private String name;
  private String employeeId;

  public SalesEmployee(String name, String employeeId) {
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

  public void sellVehicle(Vehicle vehicle, Customer customer) {
    // code to sell the vehicle to the customer
  }
}
