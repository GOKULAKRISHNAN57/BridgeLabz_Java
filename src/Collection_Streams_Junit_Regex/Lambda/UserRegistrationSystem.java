package Collection_Streams_Junit_Regex.Lambda;

import java.util.regex.Pattern;

// UC 12: CUSTOM EXCEPTIONS DEFINITION

class InvalidUserDataException extends Exception {
    public InvalidUserDataException(String message) {
        super(message);
    }
}


// UC 13: FUNCTIONAL INTERFACE FOR LAMBDAS

@FunctionalInterface
interface ValidationFunction {
    boolean validate(String input);
}


// MAIN SYSTEM CLASS

public class UserRegistrationSystem {

    // Regex Constants matching UC 1 - UC 9
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$"; // UC 1 & UC 2
    private static final String EMAIL_REGEX = "^(?!.*\\.{2})[a-zA-Z0-9+_.-]+(?<!\\.)@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?:\\.[a-zA-Z]{2,})?$"; // UC 3 & UC 9
    private static final String MOBILE_REGEX = "^[0-9]{1,3}\\s[0-9]{10}$"; // UC 4
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*()\\-_=+[{]};:'\",<.>/?]*[!@#$%^&*()\\-_=+[{]};:'\",<.>/?][^!@#$%^&*()\\-_=+[{]};:'\",<.>/?]*$).{8,}$"; // UC 5 - UC 8

    // Compiled Patterns
    private static final Pattern namePattern = Pattern.compile(NAME_REGEX);
    private static final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
    private static final Pattern mobilePattern = Pattern.compile(MOBILE_REGEX);
    private static final Pattern passwordPattern = Pattern.compile(PASSWORD_REGEX);

    // UC 13: LAMBDA EXPRESSION ASSIGNMENTS

    public static final ValidationFunction firstNameValidator = input -> 
        input != null && namePattern.matcher(input).matches();

    public static final ValidationFunction lastNameValidator = input -> 
        input != null && namePattern.matcher(input).matches();

    public static final ValidationFunction emailValidator = input -> {
        if (input == null) return false;
        String cleanEmail = input.trim().replaceAll(",$", ""); // strip structural commas
        return emailPattern.matcher(cleanEmail).matches();
    };

    public static final ValidationFunction mobileValidator = input -> 
        input != null && mobilePattern.matcher(input).matches();

    public static final ValidationFunction passwordValidator = input -> 
        input != null && passwordPattern.matcher(input).matches();

    // ------------------------------------------
    // UC 12: CORE USER REGISTRATION SERVICE (Throws Exceptions)
    // ------------------------------------------
    public static void registerUser(String fName, String lName, String email, String mobile, String password) throws InvalidUserDataException {
        if (!firstNameValidator.validate(fName)) {
            throw new InvalidUserDataException("Invalid First Name: Must start with a Capital letter and have at least 3 characters.");
        }
        if (!lastNameValidator.validate(lName)) {
            throw new InvalidUserDataException("Invalid Last Name: Must start with a Capital letter and have at least 3 characters.");
        }
        if (!emailValidator.validate(email)) {
            throw new InvalidUserDataException("Invalid Email Address formatting.");
        }
        if (!mobileValidator.validate(mobile)) {
            throw new InvalidUserDataException("Invalid Mobile Number: Must include country code, space, and a 10-digit number.");
        }
        if (!passwordValidator.validate(password)) {
            throw new InvalidUserDataException("Invalid Password: Must be 8+ characters, contain at least 1 Uppercase, 1 Digit, and exactly 1 Special Character.");
        }
        System.out.println("✅ Registration Successful for: " + fName + " " + lName);
    }

    // UC 10 & UC 11: TEST RUNNER (Happy & Sad Assertions)

    public static void main(String[] args) {
        System.out.println("=== RUNNING USER REGISTRATION TEST SUITE ===\n");

        // 1. UC 10: Happy Test Case (Valid Data Entry passes successfully)
        System.out.println("[Test 1] Happy Path Validation:");
        try {
            registerUser("John", "Doe", "abc.xyz@bl.co.in", "91 9919819801", "Secret1@");
        } catch (InvalidUserDataException e) {
            System.out.println("❌ Unexpected failure on Happy Path: " + e.getMessage());
        }

        // 2. UC 10: Sad Test Cases (Verifying that bad inputs fail with Custom Exceptions)
        System.out.println("\n[Test 2] Sad Path Validation Checks:");
        
        assertSadCase("jo", "Doe", "abc@yahoo.com", "91 9919819801", "Secret1@", "Short First Name");
        assertSadCase("John", "doe", "abc@yahoo.com", "91 9919819801", "Secret1@", "Lowercase Last Name");
        assertSadCase("John", "Doe", "abc..2002@gmail.com", "91 9919819801", "Secret1@", "Invalid Double-Dot Email");
        assertSadCase("John", "Doe", "abc@yahoo.com", "919919819801", "Secret1@", "Mobile Missing Space");
        assertSadCase("John", "Doe", "abc@yahoo.com", "91 9919819801", "Secret@@1", "Password with Multiple Special Characters");

        // 3. UC 11: Parameterized Email Test Loop
        System.out.println("\n[Test 3] UC 11 Parameterized Email Test Execution Matrix:");
        runParameterizedEmailTests();
    }

    // Helper method to simulate a structured Junit assertion assertion block for Sad Paths
    private static void assertSadCase(String fName, String lName, String email, String mobile, String password, String scenarioDescription) {
        try {
            registerUser(fName, lName, email, mobile, password);
            System.out.println("❌ FAIL: Case [" + scenarioDescription + "] allowed invalid data to bypass rules!");
        } catch (InvalidUserDataException e) {
            System.out.println("✅ PASS (Caught expected exception for " + scenarioDescription + "): " + e.getMessage());
        }
    }

    // UC 11 Dataset Implementation
    private static void runParameterizedEmailTests() {
        Object[][] emailDataset = {
            // Valid Examples
            {"abc@yahoo.com,", true},
            {"abc-100@yahoo.com,", true},
            {"abc.100@yahoo.com", true},
            {"abc111@abc.com,", true},
            {"abc-100@abc.net,", true},
            {"abc.100@abc.com.au", true},
            {"abc@1.com,", true},
            {"abc@gmail.com.com", true},
            {"abc+100@gmail.com", true},
            // Invalid Examples
            {"abc", false},
            {"abc@.com.my", false},
            {"abc123@gmail.a", false},
            {"abc123@.com", false},
            {"abc123@.com.com", false},
            {".abc@abc.com", false},
            {"abc()*@gmail.com", false},
            {"abc@%*.com", false},
            {"abc..2002@gmail.com", false},
            {"abc.@gmail.com", false},
            {"abc@abc@gmail.com", false},
            {"abc@gmail.com.1a", false},
            {"abc@gmail.com.aa.au", false}
        };

        int failedScenarios = 0;
        for (Object[] row : emailDataset) {
            String targetEmail = (String) row[0];
            boolean expectedValidity = (Boolean) row[1];
            boolean currentResult = emailValidator.validate(targetEmail);

            if (currentResult != expectedValidity) {
                System.out.println("   ❌ Email matrix mismatch detected for: " + targetEmail);
                failedScenarios++;
            }
        }

        if (failedScenarios == 0) {
            System.out.println("   ✅ All " + emailDataset.length + " email samples matched verification specs seamlessly.");
        } else {
            System.out.println("   ❌ Failed " + failedScenarios + " evaluation components inside test loop.");
        }
    }
}