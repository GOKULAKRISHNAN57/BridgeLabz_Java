package object_oriented_programming.oops_problems.Vehicle_Rental_System;

abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String num, double rate) {
        this.vehicleNumber = num;
        this.rentalRate = rate;
    }

    public double getRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, rate);
    }

    public double calculateRentalCost(int days) {
        return getRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }
}