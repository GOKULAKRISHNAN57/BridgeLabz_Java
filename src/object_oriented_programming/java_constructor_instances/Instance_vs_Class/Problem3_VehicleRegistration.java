package object_oriented_programming.java_constructor_instances.Instance_vs_Class;

class Problem3_VehicleRegistration {

    static class Vehicle {

        // Instance variables
        String ownerName;
        String vehicleType;

        // Class variable
        static double registrationFee = 1000;

        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        // Instance method
        void displayVehicleDetails() {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }

        // Class method
        static void updateRegistrationFee(double fee) {
            registrationFee = fee;
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);

        v1.displayVehicleDetails();
    }
}