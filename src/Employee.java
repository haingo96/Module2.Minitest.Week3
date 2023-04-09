public abstract class Employee {
    protected String id;
    protected String name;
    protected int age;
    protected int phoneNumber;
    protected String email;
    protected Address address;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public abstract double getReceiveSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
