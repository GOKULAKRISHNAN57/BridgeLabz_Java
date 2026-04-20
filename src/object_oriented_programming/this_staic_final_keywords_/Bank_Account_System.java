package object_oriented_programming.this_staic_final_keywords_;

class BankAccount{

    static String bankName = "Tiger Bank";

    String accountHolderName;

    final int accountNumber;

    static int totalAccounts = 0;

    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts(){
        System.out.println(totalAccounts);
    }

    public void displayDetails(){
        System.out.println("Bank : "+ bankName);
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account Number : " + this.accountNumber);

    }

}

public class Bank_Account_System {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Gokulakrishnan", 73476);
        BankAccount account2 = new BankAccount("Raashi", 12579);

        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }
    }

}
