
public class MVCArchitecturePatternDemo {
    public static void main(String[] args) {
        Employee employeeModel = retrieveEmployeeFromDatabase();
        EmployeeViewer employeeView = new EmployeeViewer();
        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);
        employeeModel.setFirstName("Daniya");
        employeeModel.setSalary((float) 60000.00);
        employeeController.updateView();
    }
    private static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setEmployeeID(0002);
        employee.setFirstName("Atiqa Khan");
        employee.setLastName("Khan");
        employee.setGender("Female");
        employee.setHiredDate("22/January/2020");
        employee.setSalary((float) 80000.00);
        return employee;
    }
}