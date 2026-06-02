package Collection_Streams_Junit_Regex.Regex.User_Registration_Problem;

import java.util.regex.Pattern;

public class UserRegistrationValidator {

    // UC 1: First Name - Starts with Capital, minimum 3 characters
    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    // UC 2: Last Name - Starts with Capital, minimum 3 characters
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    // UC 3 & UC 9: Email Validation (Handles the mandatory/optional parts and all edge-case samples)
    private static final String EMAIL_REGEX = "^(?!.*\\.{2})[a-zA-Z0-9+_.-]+(?<!\\.)@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?:\\.[a-zA-Z]{2,})?$";

    // UC 4: Mobile Format - Country code (1-3 digits) followed by a space and exactly 10 digits
    private static final String MOBILE_REGEX = "^[0-9]{1,3}\\s[0-9]{10}$";

    // UC 5 to UC 8: Password Rules combined using lookaheads:
    // (?=.*[A-Z])         -> UC 6: At least 1 Upper Case
    // (?=.*[0-9])         -> UC 7: At least 1 numeric digit
    // (?:[^\\W_]*[\\W_][^\\W_]*) -> UC 8: Has EXACTLY 1 special character (no more, no less)
    // .{8,}               -> UC 5: Minimum 8 characters total
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*()\\-_=+[{]};:'\",<.>/?]*[!@#$%^&*()\\-_=+[{]};:'\",<.>/?][^!@#$%^&*()\\-_=+[{]};:'\",<.>/?]*$).{8,}$";

    // Compilation of patterns
    private static final Pattern FIRST_NAME_PAT = Pattern.compile(FIRST_NAME_REGEX);
    private static final Pattern LAST_NAME_PAT = Pattern.compile(LAST_NAME_REGEX);
    private static final Pattern EMAIL_PAT = Pattern.compile(EMAIL_REGEX);
    private static final Pattern MOBILE_PAT = Pattern.compile(MOBILE_REGEX);
    private static final Pattern PASSWORD_PAT = Pattern.compile(PASSWORD_REGEX);

    // Validation Methods
    public static boolean validateFirstName(String name) {
        return name != null && FIRST_NAME_PAT.matcher(name).matches();
    }

    public static boolean validateLastName(String name) {
        return name != null && LAST_NAME_PAT.matcher(name).matches();
    }

    public static boolean validateEmail(String email) {
        if (email == null) return false;
        String cleanEmail = email.trim().replaceAll(",$", ""); // handles layout commas
        return EMAIL_PAT.matcher(cleanEmail).matches();
    }

    public static boolean validateMobile(String mobile) {
        return mobile != null && MOBILE_PAT.matcher(mobile).matches();
    }

    public static boolean validatePassword(String password) {
        return password != null && PASSWORD_PAT.matcher(password).matches();
    }

    // Quick self-test inside main to verify everything works
    public static void main(String[] args) {
        System.out.println("--- Testing Name Validations ---");
        System.out.println("John (First Name): " + validateFirstName("John")); // true
        System.out.println("jo (First Name): " + validateFirstName("jo"));     // false (No cap, < 3 chars)
        System.out.println("Doe (Last Name): " + validateLastName("Doe"));     // true

        System.out.println("\n--- Testing Mobile Format ---");
        System.out.println("91 9919819801: " + validateMobile("91 9919819801")); // true
        System.out.println("919919819801: " + validateMobile("919919819801"));   // false (Missing space)

        System.out.println("\n--- Testing Password Rules ---");
        System.out.println("Secret1@: " + validatePassword("Secret1@"));   // true (8 chars, 1 Cap, 1 Num, 1 Spec)
        System.out.println("secret1@: " + validatePassword("secret1@"));   // false (No Cap)
        System.out.println("Secret@@1: " + validatePassword("Secret@@1")); // false (Has 2 special chars, violates UC 8)

        System.out.println("\n--- Testing Email Validation ---");
        System.out.println("abc.xyz@bl.co.in: " + validateEmail("abc.xyz@bl.co.in")); // true
        System.out.println("abc..2002@gmail.com: " + validateEmail("abc..2002@gmail.com")); // false
    }
}