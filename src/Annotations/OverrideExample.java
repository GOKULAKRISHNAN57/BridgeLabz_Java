package Annotations;

class ParentOverride {
    void show() {
        System.out.println("Parent method");
    }
}

public class OverrideExample extends ParentOverride {

    @Override   // ensures correct overriding
    void show() {
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        ParentOverride obj = new OverrideExample();
        obj.show();   // calls child method
    }
}