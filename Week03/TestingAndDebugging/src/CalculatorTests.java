import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CalculatorTests {
    

    @Test
    public void ensureTwoPlusTwoIsFour(){
        
        // expected, what actually happened

        int result = Calculator.add(2, 2);
        // if a test fails
            // test is wrong
            // or your code is wrong

        assertEquals(4, result);
    }

    @Test
    public void ensureTwoMinusTwoIsZero(){

        int result = Calculator.subtract(2, 2);

        assertEquals(0, result);

    }

    @Test
    public void divisionTest(){
        int d = 0;
        int n = 5;

        // int result = Calculator.intDivide(n, d);

        // assertEquals(0, result);

        assertThrows(ArithmeticException.class, () -> {
            Calculator.intDivide(n, d);
        });


        assertEquals(3, Calculator.intDivide(6, 2));
    }



    @Test
    public void stringIsConvertedToLowercase(){

        assertEquals("__hello__", Calculator.processString("HeLLo"));
    }

    @Test
    public void allZsAreRemoved(){
        assertEquals("__hello__", Calculator.processString("zzzhellozzz"));
    }

    @Test
    public void isStringPaddedWithUnderscores(){
        assertEquals("__hello__", Calculator.processString("hello"));
    }


    // public void (Class, Runnable)
    // interface Runable -> 1 public method public void run() 

}
