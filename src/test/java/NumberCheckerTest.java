import org.example.NumberChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTest {
    @Test
    public void testCheckNumber() {
        assertEquals("Positive", NumberChecker.checkNumber(5));
        assertEquals("Negative", NumberChecker.checkNumber(-2));
        assertEquals("Zero", NumberChecker.checkNumber(0));
    }
}
