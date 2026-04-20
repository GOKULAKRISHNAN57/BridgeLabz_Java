package object_oriented_programming.java_constructor_instances.Access_Modifiers;

class Problem3_BankAccountManagement {

    static class BankAccount {

        public int accountNumber;
        protected String accountHolder;
        private double balance;

        // Setter
        public void setBalance(double balance) {
            this.balance = balance;
        }

        // Getter
        public double getBalance() {
            return balance;
        }
    }

    // Subclass
    static class SavingsAccount extends BankAccount {

        void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
        }
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.accountNumber = 123;
        acc.accountHolder = "Alice";
        acc.setBalance(1000);

        acc.display();
        System.out.println("Balance: " + acc.getBalance());
    }
}
