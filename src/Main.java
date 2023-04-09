public class Main {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeStaff("emp1", 20_000_000, 1_000_000, 500_000);
        Employee emp2 = new FullTimeStaff("emp2", 19_000_000, 1_000_000, 200_000);
        Employee emp3 = new FullTimeStaff("emp3", 18_000_000, 500_000, 100_000);
        Employee emp4 = new FullTimeStaff("emp4", 18_000_000, 500_000, 50_000);

        Employee emp5 = new PartTimeStaff("emp5", 50);
        Employee emp6 = new PartTimeStaff("emp6", 45);
        Employee emp7 = new PartTimeStaff("emp7", 40);

        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.add(emp1);
        employeeManager.add(emp2);
        employeeManager.add(emp3);
        employeeManager.add(emp4);
        employeeManager.add(emp5);
        employeeManager.add(emp6);
        employeeManager.add(emp7);

        System.out.println(String.format("%.0f", SalaryManager.getAverageSalary(employeeManager)));
        System.out.println(SalaryManager.getBelowAveSalaryStaff(employeeManager));
        System.out.println(String.format("%.0f", SalaryManager.getPartTimeSalary(employeeManager)));
        System.out.println(SalaryManager.sortFullTimeStaffBySalary(employeeManager));
    }
}