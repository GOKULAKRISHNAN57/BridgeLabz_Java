package object_oriented_programming.java_oop_design.Self_Problems;
import java.util.ArrayList;

// Patient class
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

// Doctor class
class Doctor {
    String name;

    // Association
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }
}

// Hospital class
class HospitalDoctorsPatients {

    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Raj");
        Patient p1 = new Patient("Ravi");

        d1.consult(p1);
    }
}