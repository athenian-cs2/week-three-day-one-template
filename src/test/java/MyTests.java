import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    
    @Test
    public void testDivisibleByFour() {
        // Test cases for numbers divisible by 4
        assertTrue(MyMain.divisibleByFour(4), "4 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(8), "8 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(12), "12 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(16), "16 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(128), "128 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(0), "0 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(-4), "-4 should be divisible by 4");
        assertTrue(MyMain.divisibleByFour(-12), "-12 should be divisible by 4");
        
        // Test cases for numbers NOT divisible by 4
        assertFalse(MyMain.divisibleByFour(1), "1 should not be divisible by 4");
        assertFalse(MyMain.divisibleByFour(3), "3 should not be divisible by 4");
        assertFalse(MyMain.divisibleByFour(5), "5 should not be divisible by 4");
        assertFalse(MyMain.divisibleByFour(14), "14 should not be divisible by 4");
        assertFalse(MyMain.divisibleByFour(26), "26 should not be divisible by 4");
        assertFalse(MyMain.divisibleByFour(-1), "-1 should not be divisible by 4");
        assertFalse(MyMain.divisibleByFour(-7), "-7 should not be divisible by 4");
    }

    @Test
    public void testSumDigits() {
        // Basic test cases
        assertEquals(7, MyMain.sumDigits(61), "sumDigits(61) should return 7");
        assertEquals(6, MyMain.sumDigits(123), "sumDigits(123) should return 6");
        assertEquals(19, MyMain.sumDigits(4096), "sumDigits(4096) should return 19");
        
        // Single digit numbers
        assertEquals(0, MyMain.sumDigits(0), "sumDigits(0) should return 0");
        assertEquals(1, MyMain.sumDigits(1), "sumDigits(1) should return 1");
        assertEquals(9, MyMain.sumDigits(9), "sumDigits(9) should return 9");
        
        // Two digit numbers
        assertEquals(9, MyMain.sumDigits(45), "sumDigits(45) should return 9");
        assertEquals(10, MyMain.sumDigits(55), "sumDigits(55) should return 10");
        
        // Numbers with zeros
        assertEquals(1, MyMain.sumDigits(100), "sumDigits(100) should return 1");
        assertEquals(3, MyMain.sumDigits(102), "sumDigits(102) should return 3");
        assertEquals(5, MyMain.sumDigits(203), "sumDigits(203) should return 5");
        
        // Larger numbers
        assertEquals(45, MyMain.sumDigits(123456789), "sumDigits(123456789) should return 45");
        assertEquals(27, MyMain.sumDigits(999), "sumDigits(999) should return 27");
    }

    // @Test
    // public void testIsSelfDivisor() {
    //     // Test cases for self-divisors
    //     assertTrue(MyMain.isSelfDivisor(128), "128 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(36), "36 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(144), "144 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(1), "1 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(2), "2 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(3), "3 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(4), "4 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(5), "5 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(6), "6 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(7), "7 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(8), "8 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(9), "9 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(12), "12 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(15), "15 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(24), "24 should be a self-divisor");
    //     assertTrue(MyMain.isSelfDivisor(48), "48 should be a self-divisor");
        
    //     // Test cases for NON self-divisors
    //     assertFalse(MyMain.isSelfDivisor(26), "26 should not be a self-divisor");
    //     assertFalse(MyMain.isSelfDivisor(4096), "4096 should not be a self-divisor");
    //     assertFalse(MyMain.isSelfDivisor(13), "13 should not be a self-divisor");
    //     assertFalse(MyMain.isSelfDivisor(23), "23 should not be a self-divisor");
    //     assertFalse(MyMain.isSelfDivisor(29), "29 should not be a self-divisor");
        
    //     // Numbers containing 0 (should all be false)
    //     assertFalse(MyMain.isSelfDivisor(10), "10 should not be a self-divisor (contains 0)");
    //     assertFalse(MyMain.isSelfDivisor(20), "20 should not be a self-divisor (contains 0)");
    //     assertFalse(MyMain.isSelfDivisor(30), "30 should not be a self-divisor (contains 0)");
    //     assertFalse(MyMain.isSelfDivisor(100), "100 should not be a self-divisor (contains 0)");
    //     assertFalse(MyMain.isSelfDivisor(101), "101 should not be a self-divisor (contains 0)");
    //     assertFalse(MyMain.isSelfDivisor(102), "102 should not be a self-divisor (contains 0)");
    //     assertFalse(MyMain.isSelfDivisor(1024), "1024 should not be a self-divisor (contains 0)");
    // }
    
    // Note: printNumsUpTo is a void method that prints to console, so we can't easily test it with JUnit
    // In a real testing scenario, you might want to capture System.out to test the output,
    // but for educational purposes, the visual verification in main() is sufficient
}
