package Collection_Streams_Junit_Regex.Exception.Unique_Examples_Problems;

class TransactionException extends Exception {
public TransactionException(String message) {
super(message);
}
}
class InvalidTransactionException extends Exception {
public InvalidTransactionException(String message) {
super(message);
}
}
public class TransactionHandler {
public void processTransaction(double amount) throws
        TransactionException, InvalidTransactionException {
if (amount < 0) {
throw new InvalidTransactionException("Negative amount: " + amount);
}
// Simulate other operations
if (amount == 0) {
throw new TransactionException("Zero amount is not allowed");
}
}
public void handleTransaction(double amount) throws TransactionException {
try {

processTransaction(amount);
} catch (InvalidTransactionException e) {
throw new TransactionException("Failed processing transaction: " + e.getMessage());

} catch (TransactionException e) {
System.err.println("Transaction error: " +

e.getMessage());
}
}
public static void main(String[] args) throws TransactionException {
TransactionHandler handler = new TransactionHandler();
handler.handleTransaction(-100);
}
}