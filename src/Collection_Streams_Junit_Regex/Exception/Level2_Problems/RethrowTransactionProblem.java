package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

class TransactionException extends Exception {
    public TransactionException(String message, Throwable cause) {
        super(message, cause); // Retains original exception cause
    }
}

public class RethrowTransactionProblem {

    public void processTransaction(String txId, double amount) throws TransactionException {
        try {
            if (amount <= 0) {
                // Simulating an unexpected core system failure runtime exception
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            System.out.println("Transaction " + txId + " processed successfully.");
        } catch (IllegalArgumentException e) {
            // Rethrowing a custom checked exception while packaging the context and original cause
            throw new TransactionException("Failed to complete transaction ID: " + txId + " for amount $" + amount, e);
        }
    }

    public static void main(String[] args) {
        RethrowTransactionProblem system = new RethrowTransactionProblem();
        
        try {
            system.processTransaction("TXN99823", -25.50);
        } catch (TransactionException e) {
            System.out.println("Alert: " + e.getMessage());
            System.out.println("Root Cause: " + e.getCause());
        }
    }
}