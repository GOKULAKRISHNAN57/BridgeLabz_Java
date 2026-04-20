package object_oriented_programming.java_oop_design.Self_Problems;
import java.util.ArrayList;

// Course class
class Course {
    String courseName;

    // List of students enrolled (Association)
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

// Student class
class Student {
    String name;

    // Association with courses
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this); // communication
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

// School class (Aggregation)
class SchoolStudentsCourses {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ravi");
        Student s2 = new Student("Arun");

        Course c1 = new Course("Java");
        Course c2 = new Course("Spring");

        // Association
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        // Aggregation
        SchoolStudentsCourses school = new SchoolStudentsCourses();
        school.addStudent(s1);
        school.addStudent(s2);

        s1.viewCourses();
        c1.showStudents();
    }
}