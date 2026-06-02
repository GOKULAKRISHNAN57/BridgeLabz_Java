package Collection_Streams_Junit_Regex.J_Unit_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

// Note: Replace this import with the correct path to your UserRegistrationValidator class

import static Collection_Streams_Junit_Regex.Regex.User_Registration_Problem.UserRegistrationValidator.validateEmail;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailValidatorJUnitTest {

    @ParameterizedTest(name = "Email: {0} -> Expected: {1} ({2})")
    @MethodSource("provideEmailTestData")
    void testEmailValidationCases(String email, boolean expected, String reason) {
        boolean actual = validateEmail(email);
        assertEquals(expected, actual, "Failed for email: " + email + " (" + reason + ")");
    }

    // This method supplies all the test scenarios cleanly
    private static Stream<Arguments> provideEmailTestData() {
        return Stream.of(
            // --- A. VALID EMAILS ---
            Arguments.of("abc@yahoo.com,", true, "Standard email with comma"),
            Arguments.of("abc-100@yahoo.com,", true, "Dash in username"),
            Arguments.of("abc.100@yahoo.com", true, "Dot in username"),
            Arguments.of("abc111@abc.com,", true, "Numbers in username"),
            Arguments.of("abc-100@abc.net,", true, "Net extension"),
            Arguments.of("abc.100@abc.com.au", true, "Double TLD country code"),
            Arguments.of("abc@1.com,", true, "Numeric domain name"),
            Arguments.of("abc@gmail.com.com", true, "Repeated extension framework"),
            Arguments.of("abc+100@gmail.com", true, "Plus routing sign sub-address"),

            // --- B. INVALID EMAILS ---
            Arguments.of("abc", false, "Missing @ symbol"),
            Arguments.of("abc@.com.my", false, "TLD cannot start with a dot"),
            Arguments.of("abc123@gmail.a", false, "Last TLD must have at least 2 chars"),
            Arguments.of("abc123@.com", false, "TLD cannot start with a dot"),
            Arguments.of("abc123@.com.com", false, "TLD cannot start with a dot"),
            Arguments.of(".abc@abc.com", false, "Email cannot start with a dot"),
            Arguments.of("abc()*@gmail.com", false, "Illegal special characters in username"),
            Arguments.of("abc@%*.com", false, "Illegal characters in domain"),
            Arguments.of("abc..2002@gmail.com", false, "Double dots are not allowed"),
            Arguments.of("abc.@gmail.com", false, "Username cannot end with a dot"),
            Arguments.of("abc@abc@gmail.com", false, "Double @ symbols are illegal"),
            Arguments.of("abc@gmail.com.1a", false, "TLD cannot contain digits"),
            Arguments.of("abc@gmail.com.aa.au", false, "Cannot have triple/multiple TLD loops")
        );
    }
}