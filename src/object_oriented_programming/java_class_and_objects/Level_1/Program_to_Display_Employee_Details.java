package object_oriented_programming.java_class_and_objects.Level_1;

public class Program_to_Display_Employee_Details {

    //Employee Class
    public static class Employee{

        String name;
        int id;
        double salary;

        //Constructor
        public Employee(String name, int id, double salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        //Display Details Method
        public void detailsOfEmployee(){
            System.out.println("Name : "+this.name+", "+"ID : "+this.id+"Salary : "+this.salary);
        }
    }


    public static void main(String[] args) {

        //Object Creation
        Employee employee = new Employee("Gokul", 798, 700000.0);

        employee.detailsOfEmployee();
    }
}
