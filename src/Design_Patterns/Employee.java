package Design_Patterns;

class Employee implements Cloneable {

    String name;

    Employee(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();   // copy object
    }
}

class PrototypeDemo {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("John");
        Employee e2 = (Employee) e1.clone();

        System.out.println(e2.name);
    }
}