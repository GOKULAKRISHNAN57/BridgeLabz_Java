package Collection_Streams_Junit_Regex.Exception.Level1;

// Custom Checked Exception for business rule violations
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystemProblem {
    private double balance = 500.00;

    // Declaring the custom checked exception with 'throws'
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            // IllegalArgumentException is an Unchecked exception, no 'throws' declaration needed
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        BankTransactionSystemProblem account = new BankTransactionSystemProblem();

        // Testing Insufficient Balance
        try {
            account.withdraw(600);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing Negative Amount Input
        try {
            account.withdraw(-50);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}