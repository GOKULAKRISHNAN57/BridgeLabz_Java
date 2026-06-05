package Design_Patterns;

abstract class Handler {

    Handler next;

    void setNext(Handler n) {
        next = n;   // set next handler
    }

    abstract void handle(String request);
}

class Managers extends Handler {
    void handle(String request) {
        if (request.equals("manager"))
            System.out.println("Handled by Manager");
        else if (next != null)
            next.handle(request);   // pass to next
    }
}

class HR extends Handler {
    void handle(String request) {
        System.out.println("Handled by HR"); // last handler
    }
}

class ChainDemo {
    public static void main(String[] args) {
        Handler m = new Managers();
        Handler h = new HR();

        m.setNext(h);

        m.handle("hr");   // passed along chain
    }
}