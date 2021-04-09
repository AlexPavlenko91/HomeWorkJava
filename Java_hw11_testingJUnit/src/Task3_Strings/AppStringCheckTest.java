package Task3_Strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppStringCheckTest {
    private final StringCheck obj = new StringCheck();

    @Test
    public void isPalindromeTest() {
        assertEquals(true, obj.isPalindrome("madam"));
    }

    @Test
    public void checkingVowelsTest() {
        assertEquals(4, obj.checkingVowels("hello madam"));
    }

    @Test
    public void checkingConsonantsTest() {
        assertEquals(6, obj.checkingConsonants("hello madam"));
    }

    @Test
    public void occurrencesTest() {
        assertEquals(3, obj.occurrences("madam", "hello madam madam madam"));
    }
}
