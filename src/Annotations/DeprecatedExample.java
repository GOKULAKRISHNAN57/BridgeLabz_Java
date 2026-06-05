package Annotations;

public class DeprecatedExample {

    @Deprecated   // marks method as old
    void oldMethod() {
        System.out.println("Old method");
    }

    void newMethod() {
        System.out.println("New method");
    }

    public static void main(String[] args) {
        DeprecatedExample obj = new DeprecatedExample();

        obj.oldMethod();   // warning shown
        obj.newMethod();
    }
}