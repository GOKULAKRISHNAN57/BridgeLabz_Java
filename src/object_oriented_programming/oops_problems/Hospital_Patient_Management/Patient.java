package object_oriented_programming.oops_problems.Hospital_Patient_Management;

import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + " (ID: " + patientId + ")");
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    double calculateBill() {
        return 5000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println(records);
    }
}

class OutPatient extends Patient {
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    double calculateBill() {
        return 500;
    }
}

class HospitalDemo {
    public static void main(String[] args) {
        List<Patient> list = new ArrayList<>();

        list.add(new InPatient(1, "Ram", 40));
        list.add(new OutPatient(2, "Sam", 25));

        for (Patient p : list) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord m) {
                m.addRecord("Checked");
                m.viewRecords();
            }
            System.out.println("------");
        }
    }
}