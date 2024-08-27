import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FibonacciSumTest {
    @Test
    void testCalculateFibonacciSumZero() {
        assertEquals(0, Main.calculateFibonacciSum(0));
    }
    @Test
    void testCalculateFibonacciSumOne() {
        assertEquals(1, Main.calculateFibonacciSum(1));
    }
    @Test
    void testCalculateFibonacciSumFive() {
        assertEquals(12, Main.calculateFibonacciSum(5));
    }
    @Test
    void testCalculateFibonacciSumTen() {
        assertEquals(143, Main.calculateFibonacciSum(10));
    }
}
