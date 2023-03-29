package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;


import static org.junit.jupiter.api.Assertions.*;

class Lab5ArrayReaderTest {
Lab5ArrayReader lab5ArrayReader;
    @BeforeEach
    void setUp() {
        lab5ArrayReader = new Lab5ArrayReader();
    }

    @Test
    void testReadOneDimensionalArray() {
        File file = new File("filetest1.txt");
        double[] result = lab5ArrayReader.readOneDimensionalArray(file);
        double[] expected = {37.0 ,80.0 ,47.0, 31.0, 17.0, 35.0, 34.0};

        assertArrayEquals(expected, result,1.e-2);
    }
    @Test
    void testReadOneDimensionalArray2() {
        File file = new File("filetest1.txt");
        double[] result = lab5ArrayReader.readOneDimensionalArray(file);
        int expected = 7;

        assertEquals(expected, result.length,1.e-2);
    }
    @Test
    void testReadTwoDimensionalArray() {
        File file = new File("filetest2.txt");
        double[][] expected = {{37.0, 80.0, 47.0, 31.0},
                               {17.0, 35.0, 34.0,  9.0},
                               {47.0, 31.0, 34.0,  9.0},
                               {37.0, 80.0, 17.0, 35.0}};
        double[][] result = lab5ArrayReader.readTwoDimensionalArray(file);
        assertArrayEquals(expected, result);

    }

    @Test
    void testReadTwoDimensionalArray2() {
        File file = new File("filetest2.txt");
        double[][] result = lab5ArrayReader.readTwoDimensionalArray(file);
        int expected = 16;
        assertEquals(expected, result.length, 1.e-2);
    }


}