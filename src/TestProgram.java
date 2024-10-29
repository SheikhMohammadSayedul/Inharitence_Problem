public class TestProgram {
    public static void main(String[] args) {
        Manager mgr = new Manager("Mr.Kamal", 70000, 15000);

        System.out.println("\nManager Name: " + mgr.getName());
        System.out.println("Manager Base Salary: " + (mgr.getSalary() - mgr.getBonus()));
        System.out.println("Manager Bonus: " + mgr.getBonus());
        System.out.println("Manager Total Salary: " + mgr.getSalary());
        mgr.setBonus(20000);
        System.out.println("\nAfter Bonus Update:");
        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Base Salary: " + (mgr.getSalary() - mgr.getBonus()));
        System.out.println("Manager Bonus: " + mgr.getBonus());
        System.out.println("Manager Total Salary: " + mgr.getSalary());
    }
}
