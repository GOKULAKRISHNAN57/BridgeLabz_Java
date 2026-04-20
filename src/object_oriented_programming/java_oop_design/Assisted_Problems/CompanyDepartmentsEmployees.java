package object_oriented_programming.java_oop_design.Assisted_Problems;
import java.util.ArrayList;

// Company class → Owns Departments (Composition)
class CompanyDepartmentsEmployees {

    String companyName;

    // Composition → Departments exist only inside Company
    ArrayList<Department> departments = new ArrayList<>();

    // Constructor
    CompanyDepartmentsEmployees(String companyName) {
        this.companyName = companyName;
    }

    // Inner class → strongly tied to Company
    class Department {
        String deptName;

        // Each department has employees
        ArrayList<Employee> employees = new ArrayList<>();

        Department(String deptName) {
            this.deptName = deptName;
        }

        void addEmployee(String empName) {
            // Employee created inside Department (Composition)
            employees.add(new Employee(empName));
        }

        void showEmployees() {
            System.out.println("Department: " + deptName);
            for (Employee e : employees) {
                System.out.println("Employee: " + e.name);
            }
        }
    }

    // Inner class → cannot exist without Department/Company
    class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }
    }

    // Add department
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Display structure
    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public static void main(String[] args) {

        // Create company
        CompanyDepartmentsEmployees company =
                new CompanyDepartmentsEmployees("Tech Corp");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        company.departments.get(0).addEmployee("Alice");
        company.departments.get(0).addEmployee("Bob");

        company.departments.get(1).addEmployee("Charlie");

        // Display structure
        company.showCompany();

        // If company is deleted → departments & employees are gone
    }
}
