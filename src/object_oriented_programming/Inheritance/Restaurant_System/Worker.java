package object_oriented_programming.Inheritance.Restaurant_System;

interface Worker {
    void performDuties();
}

class PersonBase {
    String name;
    int id;
}

class Chef extends PersonBase implements Worker {
    public void performDuties() {
        System.out.println("Cooking food");
    }
}

class Waiter extends PersonBase implements Worker {
    public void performDuties() {
        System.out.println("Serving customers");
    }
}