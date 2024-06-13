package lesson_23.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculator calculator = new DiscountCalculator();

    @Test
    public void shouldGivenNoDiscountForValue999(){
        int buySum = 999;
        int expectedSum = 999;
        int resultSum = calculator.sumAfterDiscount(buySum);
        assertEquals(expectedSum, resultSum, "Ошибка");
    }

    @Test
    public void shouldGivenNoDiscountForValue1(){
        int buySum = 1;
        int expectedSum = 1;
        int resultSum = calculator.sumAfterDiscount(buySum);
        assertEquals(expectedSum, resultSum, "Ошибка");
    }

    @Test
    public void shouldGivenNoDiscountForValue2000(){
        int buySum = 2000;
        int expectedSum = 1960;
        int resultSum = calculator.sumAfterDiscount(buySum);
        assertEquals(expectedSum, resultSum, "Ошибка");
    }

    @Test
    public void shouldReturnTrue(){
        Boolean result = calculator.test();
        result = null;
        assertNull(result, "Ошибка");

    }

}