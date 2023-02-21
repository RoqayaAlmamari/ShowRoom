public class Manager {
  private String name;
  private String employeeId;

  public Manager(String name, String employeeId) {
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

  public void approveSale(SalesEmployee salesEmployee, Customer customer, Vehicle vehicle) {
    // code to approve the sale of the vehicle to the customer by the sales employee
  }
}
