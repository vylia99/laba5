package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Lab5ArrayReader implements DoubleArrayReader{

    public double[] readOneDimensionalArray(File file) {
        try (Scanner in = new Scanner(new File(file.toURI()))){
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }

    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner in = new Scanner(new File(file.toURI()))) {
            int n = in.nextInt();
            int m = in.nextInt();
            double[][] arr = new double[n][m];
            for (int i = 0; i < arr.length; i++) {
                for (int j=0; j<arr.length;j++){
                    arr[i][j] = in.nextDouble();
                }
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }

    }

    public double[][] readTwoDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            int m = in.nextInt();
            double[][] arr = new double[n][m];
            for (int i = 0; i < arr.length; i++) {
                for (int j=0; j<arr.length;j++){
                    arr[i][j] = in.nextDouble();
                }
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }

    }


    public double[] readOneDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }
}
