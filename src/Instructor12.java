public class Instructor12 extends Person12 {
    private double salary;

    public Instructor12(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}
