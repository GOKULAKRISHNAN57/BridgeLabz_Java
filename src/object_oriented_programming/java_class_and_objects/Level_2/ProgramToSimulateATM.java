package object_oriented_programming.java_class_and_objects.Level_2;

class ProgramToSimulateATM {

    // Inner class
    static class BankAccount {
        String accountHolder;
        int accountNumber;
        double balance;

        //Constructor
        BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 12345, 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(2000);
        acc.displayBalance();
    }
}