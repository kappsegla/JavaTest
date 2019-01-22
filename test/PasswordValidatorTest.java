import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void validatePassword_LengthMoreThanSixCharacters_True() {
        assertTrue(PasswordValidator.validatePassword("ab#123"));
    }

    @Test
    void validatePassword_OnlyChars_False() {
        assertFalse(PasswordValidator.validatePassword("abcdef"));
    }

    @Test
    void validatePassword_NullPassword_IllegalArgumentException() {
            assertThrows(IllegalArgumentException.class, () ->
            PasswordValidator.validatePassword(null));
    }
}
