import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeManager() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void add(Employee e) {
        employeeList.add(e);
    }

    public void remove(Employee e) {
        employeeList.remove(e);
    }
}
