import java.util.ArrayList;
import java.util.List;

public class SalaryManager {
    public static double getAverageSalary(EmployeeManager employeeManager) {
        double sumSalary = 0;
        for (var e : employeeManager.getEmployeeList()) {
            sumSalary += e.getReceiveSalary();
        }

        return sumSalary / (employeeManager.getEmployeeList().size());
    }

    public static List<Employee> getBelowAveSalaryStaff(EmployeeManager employeeManager) {
        List<Employee> resultList = new ArrayList<>();

        for (var e : employeeManager.getEmployeeList()) {
            if (e.getReceiveSalary() < getAverageSalary(employeeManager)) {
                resultList.add(e);
            }
        }

        return resultList;
    }

    public static double getPartTimeSalary(EmployeeManager employeeManager) {
        double result = 0;

        for (var e : employeeManager.getEmployeeList()) {
            if (e.getClass() == PartTimeStaff.class) {
                result += e.getReceiveSalary();
            }
        }

        return result;
    }

    public static List<Employee> sortFullTimeStaffBySalary(EmployeeManager employeeManager) {
        List<Employee> sortedList = new ArrayList<>();

        for (var e : employeeManager.getEmployeeList()) {
            if (e.getClass() == FullTimeStaff.class) {
                sortedList.add(e);
            }
        }

        sortedList.sort((e1, e2) -> Double.compare(e1.getReceiveSalary(), e2.getReceiveSalary()));

        return sortedList;
    }
}
