package object_oriented_programming.Inheritance.Thermostat;

class Device {
    int deviceId;
    boolean status;

    Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperature;

    Thermostat(int id, boolean status, int temperature) {
        super(id, status);
        this.temperature = temperature;
    }

    void displayStatus() {
        System.out.println("Temp: " + temperature + ", Status: " + status);
    }
}