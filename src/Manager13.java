public class Manager13 extends Employee13 {
    private String department;

    public Manager13(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
