package Design_Patterns;

abstract class Process {

    final void execute() {   // template method
        step1();
        step2();
    }

    abstract void step1();
    abstract void step2();
}

class Order extends Process {

    void step1() {
        System.out.println("Select Item");
    }

    void step2() {
        System.out.println("Make Payment");
    }
}

class TemplateDemo {
    public static void main(String[] args) {
        Process p = new Order();
        p.execute();
    }
}