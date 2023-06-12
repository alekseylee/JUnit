import org.example.NumberClassifier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberClassifierTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testClassifyNumberEven(int number) {
        assertEquals("Even", NumberClassifier.classifyNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    public void testClassifyNumberOdd(int number) {
        assertEquals("Odd", NumberClassifier.classifyNumber(number));
    }
}
