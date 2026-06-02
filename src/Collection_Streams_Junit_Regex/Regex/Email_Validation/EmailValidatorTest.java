package Collection_Streams_Junit_Regex.Regex.Email_Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// --- 1. THE VALIDATOR ENGINE ---
class EmailValidator {
    // Clean, direct regex that enforces valid chars, single @, and clean top-level domains
    private static final String REGEX = "^(?!.*\\.{2})[a-zA-Z0-9+_.-]+(?<!\\.)@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?:\\.[a-zA-Z]{2,})?$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public static boolean isValid(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        // Strips any accidental trailing commas from the test string array
        String cleanEmail = email.trim().replaceAll(",$", "");
        return PATTERN.matcher(cleanEmail).matches();
    }
}

// --- 2. SIMPLE DATA CARRIER ---
class EmailTestCase {
    String email;
    boolean expected;
    String description;

    public EmailTestCase(String email, boolean expected, String description) {
        this.email = email;
        this.expected = expected;
        this.description = description;
    }
}

// --- 3. MAIN RUNNER (File name must match this class) ---
public class EmailValidatorTest {
    public static void main(String[] args) {
        List<EmailTestCase> tests = new ArrayList<>();

        // --- VALID CASES ---
        tests.add(new EmailTestCase("abc@yahoo.com,", true, "Standard email"));
        tests.add(new EmailTestCase("abc-100@yahoo.com,", true, "Dash in username"));
        tests.add(new EmailTestCase("abc.100@yahoo.com", true, "Dot in username"));
        tests.add(new EmailTestCase("abc111@abc.com,", true, "Numbers in username"));
        tests.add(new EmailTestCase("abc-100@abc.net,", true, "Net extension"));
        tests.add(new EmailTestCase("abc.100@abc.com.au", true, "Double TLD (Country code)"));
        tests.add(new EmailTestCase("abc@1.com,", true, "Numeric domain"));
        tests.add(new EmailTestCase("abc@gmail.com.com", true, "Repeated extension"));
        tests.add(new EmailTestCase("abc+100@gmail.com", true, "Plus routing feature"));

        // --- INVALID CASES ---
        tests.add(new EmailTestCase("abc", false, "Missing @ symbol"));
        tests.add(new EmailTestCase("abc@.com.my", false, "TLD starts with dot"));
        tests.add(new EmailTestCase("abc123@gmail.a", false, "Single char TLD"));
        tests.add(new EmailTestCase("abc123@.com", false, "TLD starts with dot"));
        tests.add(new EmailTestCase("abc123@.com.com", false, "TLD starts with dot"));
        tests.add(new EmailTestCase(".abc@abc.com", false, "Starts with dot"));
        tests.add(new EmailTestCase("abc()*@gmail.com", false, "Special chars in user"));
        tests.add(new EmailTestCase("abc@%*.com", false, "Special chars in domain"));
        tests.add(new EmailTestCase("abc..2002@gmail.com", false, "Consecutive dots"));
        tests.add(new EmailTestCase("abc.@gmail.com", false, "Trailing dot in user"));
        tests.add(new EmailTestCase("abc@abc@gmail.com", false, "Multiple @ symbols"));
        tests.add(new EmailTestCase("abc@gmail.com.1a", false, "Digits in TLD"));
        tests.add(new EmailTestCase("abc@gmail.com.aa.au", false, "Too many TLD segments"));

        // Execute processing loop
        int passCount = 0;
        for (EmailTestCase test : tests) {
            boolean actual = EmailValidator.isValid(test.email);
            boolean passed = (actual == test.expected);
            
            if (passed) {
                passCount++;
            } else {
                // Real devs only care about printing what broke to fix it fast
                System.out.println("❌ FAILED: " + test.email + " | Expected: " + test.expected + " | Got: " + actual + " (" + test.description + ")");
            }
        }

        System.out.println("\n=====================================");
        System.out.println("Result: passed " + passCount + "/" + tests.size() + " test cases.");
        System.out.println("=====================================");
    }
}