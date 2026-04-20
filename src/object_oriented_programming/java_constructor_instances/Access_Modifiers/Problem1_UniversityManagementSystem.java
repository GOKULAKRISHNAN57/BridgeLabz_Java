package object_oriented_programming.java_constructor_instances.Access_Modifiers;

class Problem1_UniversityManagementSystem {

    static class Student {

        // Access modifiers
        public int rollNumber;      // accessible everywhere
        protected String name;      // accessible in subclass
        private double CGPA;        // accessible only inside class

        // Setter for private variable
        public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
        }

        // Getter for private variable
        public double getCGPA() {
            return CGPA;
        }
    }

    // Subclass
    static class PostgraduateStudent extends Student {

        void display() {
            // accessing protected and public variables
            System.out.println("Roll: " + rollNumber);
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        s.rollNumber = 101;
        s.name = "John";
        s.setCGPA(8.5);

        s.display();
        System.out.println("CGPA: " + s.getCGPA());
    }
}
