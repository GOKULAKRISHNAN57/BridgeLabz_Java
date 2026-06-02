package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

// Defining custom exceptions
class UserAlreadyExistsException extends Exception { // Checked
    public UserAlreadyExistsException(String msg) { super(msg); }
}

class UserNotFoundException extends RuntimeException { // Unchecked
    public UserNotFoundException(String msg) { super(msg); }
}

public class ThrowAndThrowsProblem {

    // 1. Uses 'throws' to declare a checked exception that MUST be handled by the caller
    public void registerUser(String username) throws UserAlreadyExistsException {
        if ("admin".equals(username)) {
            throw new UserAlreadyExistsException("Username 'admin' is already taken.");
        }
        System.out.println("User " + username + " registered successfully!");
    }

    // 2. Uses 'throw' for an unchecked exception (does not strictly require 'throws' signature)
    public void checkUserExistence(String username) {
        if ("guest".equals(username)) {
            throw new UserNotFoundException("User 'guest' was not found in the database.");
        }
        System.out.println("User " + username + " exists.");
    }

    public static void main(String[] args) {
        ThrowAndThrowsProblem service = new ThrowAndThrowsProblem();

        // 3. Handling exceptions in main
        try {
            service.registerUser("admin");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Registration Error: " + e.getMessage());
        }

        try {
            service.checkUserExistence("guest");
        } catch (UserNotFoundException e) {
            System.out.println("Lookup Error: " + e.getMessage());
        }
    }
}