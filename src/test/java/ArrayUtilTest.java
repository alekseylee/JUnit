import org.example.ArrayUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {
    @Test
    public void testFindMinNumber() {
        int[] numbers1 = {5, 3, 8, 2, 7};
        assertEquals(2, ArrayUtils.findMinNumber(numbers1));

        int[] numbers2 = {-1, -5, -10, -3, -7};
        assertEquals(-10, ArrayUtils.findMinNumber(numbers2));

        int[] numbers3 = {0};
        assertEquals(0, ArrayUtils.findMinNumber(numbers3));
    }

    @Test
    public void testFindMinNumberEmptyArray() {
        int[] emptyArray = {};
        try {
            ArrayUtils.findMinNumber(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Array is empty", e.getMessage());
        }
    }
}
