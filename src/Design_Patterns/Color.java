package Design_Patterns;

interface Color {
    void applyColor();
}

class Red implements Color {
    public void applyColor() {
        System.out.println("Red Color");
    }
}

abstract class Shapes {
    protected Color color;

    Shapes(Color c) {
        this.color = c;
    }

    abstract void draw();
}

class Circles extends Shapes {

    Circles(Color c) {
        super(c);
    }

    void draw() {
        System.out.print("Circle with ");
        color.applyColor();   // bridge call
    }
}

class BridgeDemo {
    public static void main(String[] args) {
        Shapes s = new Circles(new Red());
        s.draw();
    }
}