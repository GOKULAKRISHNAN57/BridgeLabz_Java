package object_oriented_programming.Inheritance.Employee_Management_System;

class Intern extends Employee {
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Intern Duration: " + duration + " months");
    }
}
