package Classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    private Average average;
    @BeforeEach
    void setup(){
        average = new Average();
    }

    @Test
    void testAverageNotNull(){
        assertNotNull(average);
    }

    @Test
    void testForAddition(){
        assertEquals(6, average.add(1, 2, 3));
    }

    @Test
    void testInputIsNotNegative(){
        assertEquals(22, average.collectUserInput(5,15,2));
    }

    @Test
    void testForAverage(){
        assertEquals(10, average.forAverage(10,15,5));
    }

    @Test
    void testForProduct(){
        assertEquals(500, average.forProduct(10,10,5));
    }


    @Test
    void testForLargeNumber(){
        assertEquals(100, average.largest(12, 100, 76));
    }
    @Test
    void testForSmallestNumber(){
        assertEquals(5, average.smallestNum(100,5,50));
    }
}