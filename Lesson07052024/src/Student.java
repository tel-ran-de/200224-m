public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
