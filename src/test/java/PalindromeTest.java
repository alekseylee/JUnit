import org.example.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertFalse(Palindrome.isPalindrome(null));
        assertFalse(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isPalindrome("level"));
        assertTrue(Palindrome.isPalindrome("radar"));
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("openai"));
        assertTrue(Palindrome.isPalindrome("Able was I ere I saw Elba"));
        assertFalse(Palindrome.isPalindrome("Java is fun"));
    }
}
