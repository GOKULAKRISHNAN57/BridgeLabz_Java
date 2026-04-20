package object_oriented_programming.this_staic_final_keywords_;

class Vehicle {

    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;                // using this
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber; // final
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicle() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationNumber);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {

        Object obj = new Vehicle("Alice", "Car", "TN01AB1234");

        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            v.displayVehicle();
        }

        Vehicle.updateRegistrationFee(7000);
    }
}