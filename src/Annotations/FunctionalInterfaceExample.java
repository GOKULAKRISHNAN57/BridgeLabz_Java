package Annotations;

@FunctionalInterface   // only one abstract method allowed
interface MyFunc {
    void run();

    default void show() {
        System.out.println("Default method");
    }
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        MyFunc obj = () -> {
            System.out.println("Lambda executed");
        };

        obj.run();   // lambda call
        obj.show();
    }
}