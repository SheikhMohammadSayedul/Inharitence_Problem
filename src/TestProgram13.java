public class TestProgram13 {
    public static void main(String[] args) {
        Employee13 employee = new Employee13("John Doe", 50000);
        Manager13 manager = new Manager13("Alice Smith", 75000, "IT");
        Executive13 executive = new Executive13("Bob Brown", 100000, "Finance");

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
    }
}
