public class FullTimeStaff extends Employee{
    private double contractSalary;
    private double bonusSalary;
    private double penaltyAmount;

    public FullTimeStaff() {
    }

    public FullTimeStaff(String name, double contractSalary, double bonusSalary, double penaltyAmount) {
        super(name);
        this.contractSalary = contractSalary;
        this.bonusSalary = bonusSalary;
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public double getReceiveSalary() {
        return contractSalary + bonusSalary - penaltyAmount;
    }
}
