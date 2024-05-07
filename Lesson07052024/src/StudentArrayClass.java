public class StudentArrayClass {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Alex"),
                new Student("Ivan"),
                new Student("Petr")
        };
//        Student[] students = new Student[3];
//        students[0] = new Student("Alex");
//        students[1] = new Student("Ivan");
//        students[2] = new Student("Petr");

        System.out.println("Длина массива: " + students.length);
        System.out.println("Студенты:");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
