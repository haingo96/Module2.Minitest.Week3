public class PartTimeStaff extends Employee{
    private int workHours;

    public PartTimeStaff() {
    }

    public PartTimeStaff(String name, int workHours) {
        super(name);
        this.workHours = workHours;
    }

    @Override
    public double getReceiveSalary() {
        return workHours * 100_000;
    }
}
