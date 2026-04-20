package object_oriented_programming.Inheritance.Vehicle_Hybrid;

interface Refuelable {
    void refuel();
}

class VehicleBase {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends VehicleBase {
    void charge() {
        System.out.println("Charging...");
    }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol...");
    }
}