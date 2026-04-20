package object_oriented_programming.this_staic_final_keywords_;

class Employee{

    static String companyName = "BrainDrain";
    static int totalEmployees = 0;
    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees(){
        System.out.println("Total Employees : "+ totalEmployees);

    }

    void displayEmployeeDetails(){
        System.out.println("Company Name : "+ companyName);
        System.out.println("Name : "+ this.name);
        System.out.println("ID : "+ this.id);
        System.out.println("Designation : "+ this.designation);

    }
}

public class Employee_Management_System {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Gokul",798,"chennai");
        Employee employee2 = new Employee("Dinaker",823,"chennai");

        Employee.displayTotalEmployees();

        if(employee1 instanceof Employee){
            employee1.displayEmployeeDetails();
        }
    }
}
