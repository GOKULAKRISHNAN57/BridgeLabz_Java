package object_oriented_programming.this_staic_final_keywords_;
class Patient {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment) {
        this.name = name;        // using this
        this.age = age;
        this.ailment = ailment;
        this.patientID = ++totalPatients; // unique final ID
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        System.out.println(patientID + " " + name + " " + age + " " + ailment);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {

        Object obj = new Patient("Bob", 30, "Fever");

        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            p.displayPatient();
        }

        Patient.getTotalPatients();
    }
}
