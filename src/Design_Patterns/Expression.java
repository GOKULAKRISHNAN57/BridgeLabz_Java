package Design_Patterns;

interface Expression {
    int interpret();
}

class Add implements Expression {

    int a, b;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int interpret() {
        return a + b;   // evaluate expression
    }
}

class InterpreterDemo {
    public static void main(String[] args) {
        Expression exp = new Add(5, 3);
        System.out.println(exp.interpret());
    }
}