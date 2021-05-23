public class EmployeeController {
    private Employee model;
    private EmployeeViewer view;
    public EmployeeController(Employee model, EmployeeViewer view) {
        this.model = model;
        this.view = view;
    }
    public Employee getModel() {
        return model;
    }
    public void setModel(Employee model) {
        this.model = model;
    }
    public void updateView() {
        view.EmployeeDetails(model.getEmployeeID(),model.getFirstName(),model.getLastName(), model.getGender(), model.getHiredDate(),model.getSalary());
    }
}