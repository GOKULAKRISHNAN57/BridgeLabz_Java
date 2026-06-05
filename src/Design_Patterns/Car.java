package Design_Patterns;

interface Car {
    void model();
}

class Sedan implements Car {
    public void model() {
        System.out.println("Sedan Car");
    }
}

abstract class VehicleFactory {
    abstract Car getCar();
}

class CarFactory extends VehicleFactory {
    Car getCar() {
        return new Sedan();   // create specific car
    }
}

class AbstractFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Car c = factory.getCar();
        c.model();
    }
}