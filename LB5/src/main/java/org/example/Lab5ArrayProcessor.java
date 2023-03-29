package org.example;

public class Lab5ArrayProcessor implements ArrayProcessor{
    public double calculate(double[] array) {
        double q=0;
        for (int i = 0; i < array.length; i++) {
         q+=array[i]*array[i];
        }
        return q;
    }

    public double calculate(double[][] array2) {
        double sum = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array2[i][j]>0) {
                    sum += array2[i][j];
                }
            }
        }
            return sum;

    }
    public void processArray(double[] array) {
        System.out.println("suma="+ calculate(array));

    }

    public void processArray(double[][] array2) {
            System.out.println("suma="+ calculate(array2));
    }
}
