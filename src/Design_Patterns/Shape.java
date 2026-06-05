package Design_Patterns;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle Drawn");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle Drawn");
    }
}

class ShapeFactory {

    static Shape getShape(String type) {   // factory method
        if (type.equalsIgnoreCase("circle"))
            return new Circle();
        else
            return new Rectangle();
    }
}

class FactoryDemo {
    public static void main(String[] args) {
        Shape s = ShapeFactory.getShape("circle");
        s.draw();   // object created via factory
    }
}