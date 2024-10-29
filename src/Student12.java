public class Student12 extends Person12 {
    private String major;
    public Student12(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
