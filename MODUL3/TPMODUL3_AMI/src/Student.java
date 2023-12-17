import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourses = new ArrayList<String>();
    }

    public void enrollInCourse(String course) {
        this.enrolledCourses.add(course);
    }

    @Override
    public String GetUserDetails() {
        String details = super.GetUserDetails();
        details += "\nEnrolled Courses:";
        for (String course : this.enrolledCourses) {
            details += "\n" + course;
        }
        return details;
    }
    
}
