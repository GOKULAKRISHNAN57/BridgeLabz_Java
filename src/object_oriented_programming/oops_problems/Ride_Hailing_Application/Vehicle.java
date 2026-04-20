package object_oriented_programming.oops_problems.Ride_Hailing_Application;

import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public double getRate() { return ratePerKm; }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(driverName + " - " + vehicleId);
    }
}

interface GPS {
    void updateLocation(String location);
    String getCurrentLocation();
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return getRate() * distance;
    }

    public void updateLocation(String loc) {
        this.location = loc;
    }

    public String getCurrentLocation() {
        return location;
    }
}

class Bike extends Vehicle {
    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return getRate() * distance * 0.8;
    }
}

class Auto extends Vehicle {
    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return getRate() * distance * 0.9;
    }
}

class RideDemo {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();

        list.add(new Car("C1", "Raj", 15));
        list.add(new Bike("B1", "Arun", 10));
        list.add(new Auto("A1", "Kumar", 12));

        for (Vehicle v : list) {
            v.getVehicleDetails();
            System.out.println("Fare: " + v.calculateFare(10));

            if (v instanceof GPS g) {
                g.updateLocation("Chennai");
                System.out.println("Location: " + g.getCurrentLocation());
            }

            System.out.println("------");
        }
    }
}