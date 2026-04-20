package object_oriented_programming.java_constructor_instances.Access_Modifiers;

class Problem4_EmployeeRecords {

    static class Employee {

        public int employeeID;
        protected String department;
        private double salary;

        // Setter
        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Getter
        public double getSalary() {
            return salary;
        }
    }

    // Subclass
    static class Manager extends Employee {

        void display() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 1;
        m.department = "IT";
        m.setSalary(80000);

        m.display();
        System.out.println("Salary: " + m.getSalary());
    }
}