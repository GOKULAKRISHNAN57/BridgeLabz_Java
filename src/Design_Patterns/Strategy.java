package Design_Patterns;

interface Strategy {
    void execute(int a, int b);
}

class AddStrategy implements Strategy {
    public void execute(int a, int b) {
        System.out.println(a + b);
    }
}

class Context {

    Strategy s;

    Context(Strategy s) {
        this.s = s;
    }

    void run(int a, int b) {
        s.execute(a, b);   // runtime algorithm
    }
}

class StrategyDemo {
    public static void main(String[] args) {
        Context c = new Context(new AddStrategy());
        c.run(5, 3);
    }
}