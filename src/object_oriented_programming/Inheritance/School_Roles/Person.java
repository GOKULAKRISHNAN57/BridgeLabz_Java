package object_oriented_programming.Inheritance.School_Roles;

class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    void displayRole() {
        System.out.println("Student of grade " + grade);
    }
}

class Staff extends Person {
    String department;

    void displayRole() {
        System.out.println("Staff in " + department);
    }
}