package org.example;

public class Lab5ArrayProcessor implements ArrayProcessor{
    public double calculate(double[] array) {
        double q=0;
        int n = array.length;
        double [] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
         q=Math.sqrt(arr[(i++)]);

        }
        return q;
    }

    public double calculate(double[][] array) {
        return 0;
    }

    public void processArray(double[] array) {

    }

    public void processArray(double[][] array) {

    }
}
