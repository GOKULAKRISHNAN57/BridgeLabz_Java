package object_oriented_programming.java_oop_design.Self_Problems;
import java.util.ArrayList;

// Faculty (independent → Aggregation)
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

// University class
class UniversityFacultiesDepartments {

    // Aggregation
    ArrayList<Faculty> faculties = new ArrayList<>();

    // Composition
    ArrayList<Department> departments = new ArrayList<>();

    // Inner class → Composition
    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void addDepartment(String name) {
        departments.add(new Department(name));
    }

    public static void main(String[] args) {

        UniversityFacultiesDepartments uni =
                new UniversityFacultiesDepartments();

        // Faculties exist independently
        Faculty f1 = new Faculty("Dr. Kumar");

        uni.addFaculty(f1);

        // Departments created inside university
        uni.addDepartment("CSE");
        uni.addDepartment("ECE");

        System.out.println("University setup complete");
    }
}