package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double[] array;
        double[][] array2;
            Lab5ArrayReader lab5ArrayReader = new Lab5ArrayReader();
            Lab5ArrayProcessor lab5ArrayProcessor = new Lab5ArrayProcessor();

        while (choice != 3) {
            System.out.println("Оберіть необхідну дію:");
            System.out.println("1. Розрахувати сумму квадратів елементів масиву з файлу lab5.1.txt.");
            System.out.println("2. Розрахувати сумму елементів виділеної частини з файлу lab52.txt.");
            System.out.println("3. Вихід з программи.");
            choice = scanner.nextInt();

            switch (choice){

            case 1 ->{
                System.out.println("1.");
                array=lab5ArrayReader.readOneDimensionalArray("lab5.1.txt");
                lab5ArrayProcessor.processArray(array);
            }
            case 2 ->{
                System.out.println("2.");
                array2=lab5ArrayReader.readTwoDimensionalArray("lab52.txt");
                lab5ArrayProcessor.processArray(array2);
            }

            case 3 -> System.out.println("Вихід з программи.");
            default -> System.out.println("Невірний выбір. Спробуйте ще.");
            }
        }
        }

}
