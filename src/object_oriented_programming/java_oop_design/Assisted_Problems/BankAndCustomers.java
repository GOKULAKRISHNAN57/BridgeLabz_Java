package object_oriented_programming.java_oop_design.Assisted_Problems;
import java.util.HashMap;

// Customer class → independent entity
class Customer {
    String name;

    // Constructor
    Customer(String name) {
        this.name = name;
    }

    // Method to communicate with Bank
    void viewBalance(BankAndCustomers bank) {
        double balance = bank.getBalance(this);
        System.out.println(name + " balance: " + balance);
    }
}

// Bank class → associated with Customer
class BankAndCustomers {
    String bankName;

    // Association mapping (Customer ↔ Balance)
    HashMap<Customer, Double> accounts = new HashMap<>();

    // Constructor
    BankAndCustomers(String bankName) {
        this.bankName = bankName;
    }

    // Open account for customer
    void openAccount(Customer customer, double amount) {
        accounts.put(customer, amount);
        System.out.println(customer.name + " opened account in " + bankName);
    }

    // Get balance of a customer
    double getBalance(Customer customer) {
        return accounts.getOrDefault(customer, 0.0);
    }

    public static void main(String[] args) {

        // Creating objects independently
        BankAndCustomers bank = new BankAndCustomers("SBI");
        Customer c1 = new Customer("Ravi");

        // Association happens here
        bank.openAccount(c1, 5000);

        // Communication between objects
        c1.viewBalance(bank);
    }
}