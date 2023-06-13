import org.example.calculator.Calculator;
import org.example.calculator.exception.NotANumberException;
import org.example.calculator.exception.NullException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @TestFactory
    Collection<DynamicTest> calculations_must_fail_when_one_of_the_parameters_is_null() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Checks if add throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.add(null, 2.0));
                }),
                DynamicTest.dynamicTest("Checks if subtract throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.subtract(2.0, null));
                }),
                DynamicTest.dynamicTest("Checks if multiply throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.multiply(2.0, null));
                }),
                DynamicTest.dynamicTest("Checks if divide throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.divide(2.0, null));
                }),
                DynamicTest.dynamicTest("Checks if pow throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.power(2.0, null));
                }),
                DynamicTest.dynamicTest("Checks if abs throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.absolute(null));
                }),
                DynamicTest.dynamicTest("Checks if square throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.square(null));
                }),
                DynamicTest.dynamicTest("Checks if sqrt throws Exception when given a null value", () -> {
                    assertThrows(NullException.class, () -> calculator.squareRoot(null));
                })
        );
    }

    @Test
    @DisplayName("Checks if a and b are added correctly when they are double and valid")
    // Naamgevingsconventie: method_name_must_succeed_when_scenario
    void add_must_succeed_when_a_and_b_are_double_and_valid() {
        // Scenario om te testen of de add methode werkt
        Double expected = 5.0;
        Double actual = calculator.add(2.0, 3.0);

        // Zorg ervoor dat de test wordt succes
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if a and b are added correctly. " +
            "It must throw an CalculatorException when a or b is null or Double.NAN")
    public void add_must_throw_a_calculator_exception_when_a_or_b_is_Double_NaN() {
        assertThrows(NotANumberException.class, () -> calculator.add(Double.NaN, 3.0));
    }

    @Test
    @DisplayName("Checks if a and b are added correctly when they are double but one of them is Double.NAN")
    void subtract_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.subtract(Double.NaN, 2.0));
    }

    @Test
    @DisplayName("Checks if multiply fails when one of the numbers is Double.NAN")
    void multiply_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.multiply(Double.NaN, 2.0));
    }

    @Test
    @DisplayName("Checks if divide fails when one of the numbers is Double.NAN")
    void divide_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.divide(Double.NaN, 2.0));
    }

    @Test
    @DisplayName("Checks if square fails when one of the numbers is Double.NAN")
    void square_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.square(Double.NaN));
    }

    @Test
    @DisplayName("Checks if square root fails when one of the numbers is Double.NAN")
    void squareRoot_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.squareRoot(Double.NaN));
    }

    @Test
    @DisplayName("Checks if power fails when one of the numbers is Double.NAN")
    void power_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.power(1.0, Double.NaN));
    }

    @Test
    @DisplayName("Checks if absolute value fails when one of the numbers is Double.NAN")
    void absolute_must_fail_when_one_of_the_numbers_is_Double_NaN() {
        assertThrows(NotANumberException.class, ()-> calculator.absolute(Double.NaN));
    }
}