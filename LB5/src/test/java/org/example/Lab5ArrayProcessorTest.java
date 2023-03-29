package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab5ArrayProcessorTest {
    Lab5ArrayProcessor lab5ArrayProcessor;
    @BeforeEach
    void setUp() {
        lab5ArrayProcessor = new Lab5ArrayProcessor();
    }
    @Test
    void calculate() {
    double[] a = {2,8,12,6,14};
    double expected = 444;
    double result =lab5ArrayProcessor.calculate(a);
    assertEquals(expected,result,1e-2);
    }
    @Test
    void calculate2(){
        double[][] b = {{ 2,   8,  12, 6,  14},
                        { 4,  -5,   6, 8,  -1},
                        { 7,   9, -10, 3,   9},
                        {-8,  -4,  15, 6,  11},
                        { 8,  16,  -5, 8,  4}};
        double expected = 79;
        double result = lab5ArrayProcessor.calculate(b);
        assertEquals(expected,result,1e-2);
    }
}