public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("CSE101", "Introduction to Programming", 4);
        Course c2 = new Course("MAT101", "Calculus I", 3);

        Student s = new Student("Kaan Koyuncu", 1, "20260001");
        s.enroll(c1);
        s.enroll(c2);
        s.setGrade(c1, 3.5);
        s.setGrade(c2, 3.0);

        System.out.println(s.getName() + " enrolled courses: " + s.getEnrolledCourses());
        System.out.println("GPA: " + s.calculateGPA());
    }
}
