import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentNo;
    private List<Course> enrolledCourses = new ArrayList<>();
    private List<Double> grades = new ArrayList<>();

    public Student(String name, int id, String studentNo) {
        super(name, id);
        this.studentNo = studentNo;
    }

    public void enroll(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            grades.add(0.0);
        }
    }

    public void drop(Course course) {
        int i = enrolledCourses.indexOf(course);
        if (i >= 0) {
            enrolledCourses.remove(i);
            grades.remove(i);
        }
    }

    public void setGrade(Course course, double grade) {
        int i = enrolledCourses.indexOf(course);
        if (i >= 0) grades.set(i, grade);
    }

    public double calculateGPA() {
        double total = 0; int credits = 0;
        for (int i = 0; i < enrolledCourses.size(); i++) {
            int c = enrolledCourses.get(i).getCredits();
            total += grades.get(i) * c;
            credits += c;
        }
        return credits == 0 ? 0 : total / credits;
    }

    public String getStudentNo() { return studentNo; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }
}
