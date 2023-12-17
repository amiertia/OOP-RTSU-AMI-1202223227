import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static List<String> courses = new ArrayList<>();
    private static Map<Integer, List<Student>> courseEnrollments = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Predefined courses for demonstration
        courses.add("101, Statistika Industri");
        courses.add("102, Desain Jaringan Komputer");
        courses.add("103, Sistem Operasi");
        courses.add("104, Pemrograman Berorientasi Objek");
        courses.add("105, Algoritma dan Struktur Data");

        // Main interaction loop
        while (true) {
            System.out.println("Please choose an option: ");
            System.out.println(
                    "1. Add Student\n2. Add Teacher\n3. Add Admin\n4. Check Course Enrollments\n5. Check Available Course\n6. Exit");
            int choice = getIntInput();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            String name;
            int id;

            switch (choice) {
                case 1:
                    // Prompt for name and ID for adding a student
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    id = getIntInput();

                    Student student = new Student(name, id);
                    enrollStudent(student);
                    System.out.println(student.GetUserDetails());
                    break;
                case 2:
                    // Prompt for name and ID for adding a teacher
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    id = getIntInput();

                    Teacher teacher = new Teacher(name, id);
                    assignTeacher(teacher);
                    System.out.println(teacher.GetUserDetails());
                    break;
                case 3:
                    // Prompt for name and ID for adding an admin
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    id = getIntInput();

                    Admin admin = new Admin(name, id);
                    manageAdmin(admin);
                    System.out.println(admin.GetUserDetails());
                    break;
                case 4:
                    // Only prompt for the course ID to check enrollments
                    checkCourseEnrollments();
                    break;
                case 5:
                    // No need to prompt for anything, just list available courses
                    System.out.println("Available courses:");
                    for (String course : courses) {
                        System.out.println(course);
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Use return to exit the program
                default:
                    System.out.println("Invalid option selected.");
                    break;
            }
        }

        scanner.close();
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static void enrollStudent(Student student) {
        System.out.println("Available courses:");
        for (String course : courses) {
            System.out.println(course);
        }
        System.out.print("Enter course ID to enroll: ");
        int courseId = getIntInput();
        student.enrollInCourse(String.valueOf(courseId)); // Assuming enrollInCourse takes a String

        // Enroll the student in the course
        courseEnrollments.computeIfAbsent(courseId, k -> new ArrayList<>()).add(student);
    }

    private static void assignTeacher(Teacher teacher) {
        System.out.print("Enter course ID to teach: ");
        String course = scanner.nextLine();
        teacher.teachClass(course);
    }

    private static void manageAdmin(Admin admin) {
        System.out.print("Enter course ID to manage: ");
        String course = scanner.nextLine();
        admin.manageSystem(course);
    }

    private static void checkCourseEnrollments() {
        System.out.print("Enter course ID to check enrollments: ");
        int courseId = getIntInput();
        if (courseEnrollments.containsKey(courseId)) {
            List<Student> enrolledStudents = courseEnrollments.get(courseId);
            if (enrolledStudents != null && !enrolledStudents.isEmpty()) {
                System.out.println("Students enrolled in course ID " + courseId + ":");
                for (Student student : enrolledStudents) {
                    System.out.println(student.GetUserDetails());
                }
            } else {
                System.out.println("No students are enrolled in course ID " + courseId);
            }
        } else {
            System.out.println("Course ID " + courseId + " is not found.");
        }
    }

}
