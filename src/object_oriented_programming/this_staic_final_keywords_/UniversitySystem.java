package object_oriented_programming.this_staic_final_keywords_;

class Student {

    static String universityName = "ABC University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;              // using this
        this.rollNumber = rollNumber;  // final
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        System.out.println(name + " " + rollNumber + " " + grade);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Object obj = new Student("John", 101, 'A');

        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.displayStudent();
        }

        Student.displayTotalStudents();
    }
}
