public class TestProgram12 {
    public static void main(String[] args) {
        Person12 person = new Person12("John Doe", 1980);
        Student12 student = new Student12("Alice Smith", 2000, "Computer Science");
        Instructor12 instructor = new Instructor12("Dr. Brown", 1975, 80000);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
