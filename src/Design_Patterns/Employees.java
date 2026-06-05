package Design_Patterns;

import java.util.*;

interface Employees {
    void show();
}

class Developer implements Employees {
    public void show() {
        System.out.println("Developer");
    }
}

class Manager implements Employees {

    List<Employees> list = new ArrayList<>();

    void add(Employees e) {
        list.add(e);
    }

    public void show() {
        for (Employees e : list)
            e.show();   // recursive
    }
}

class CompositeDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.add(new Developer());
        m.add(new Developer());

        m.show();
    }
}