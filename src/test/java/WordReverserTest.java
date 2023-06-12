import org.example.WordReverser;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverserTest {
    @ParameterizedTest
    @ValueSource(strings = {"Boot", "Vliegen", "Hello", "OpenAI"})
    public void testReverseWord(String word) {
        String reversed = WordReverser.reverseWord(word);
        assertEquals(new StringBuilder(word).reverse().toString(), reversed);
    }
}
