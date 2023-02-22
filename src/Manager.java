public class Manager {
  private String name;
  private String  managerId;

  public Manager(String name, String managerId) {
    this.name = name;
    this.managerId = managerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmployeeId() {
    return managerId;
  }

  public void setEmployeeId(String employeeId) {
    this.managerId = employeeId;
  }

  public void approveSale(SalesEmployee salesEmployee, Customer customer, Vehicle vehicle) {
    // code to approve the sale of the vehicle to the customer by the sales employee
  }
}
