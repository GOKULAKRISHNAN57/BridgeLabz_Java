package Design_Patterns;

class OldPrinter {
    void oldPrint() {
        System.out.println("Old Printer");
    }
}

interface NewPrinter {
    void print();
}

class Adapter implements NewPrinter {

    OldPrinter op = new OldPrinter();

    public void print() {
        op.oldPrint();   // adapting method
    }
}

class AdapterDemo {
    public static void main(String[] args) {
        NewPrinter p = new Adapter();
        p.print();
    }
}