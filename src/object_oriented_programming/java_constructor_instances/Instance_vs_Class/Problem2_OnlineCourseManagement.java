package object_oriented_programming.java_constructor_instances.Instance_vs_Class;

class Problem2_OnlineCourseManagement {

    static class Course {

        // Instance variables
        String courseName;
        int duration;
        double fee;

        // Class variable
        static String instituteName = "ABC Institute";

        Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        // Instance method
        void displayCourseDetails() {
            System.out.println("Course: " + courseName);
            System.out.println("Duration: " + duration);
            System.out.println("Fee: " + fee);
            System.out.println("Institute: " + instituteName);
        }

        // Class method
        static void updateInstituteName(String newName) {
            instituteName = newName;
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");

        c1.displayCourseDetails();
    }
}
