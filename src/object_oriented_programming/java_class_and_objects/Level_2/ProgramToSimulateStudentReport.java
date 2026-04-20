package object_oriented_programming.java_class_and_objects.Level_2;
class ProgramToSimulateStudentReport {

    // Inner class (actual model)
    static class Student {
        String name;
        int rollNumber;
        double marks;

        // Constructor
        Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        // Method to calculate grade
        String calculateGrade() {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 50) return "C";
            else return "Fail";
        }

        // Method to display details
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }
    }

    public static void main(String[] args) {
        Student s = new Student("John", 101, 85);
        s.displayDetails();
    }
}