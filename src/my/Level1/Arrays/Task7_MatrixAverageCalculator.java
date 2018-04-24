package my.Level1.Arrays;
/*Написать метод подсчета среднего арифметического
 всех элементов матрицы.
 Предполагается, что матрица прямоугольная.
        int avg(int[][] matrix)*/

import java.util.Random;
import java.util.Scanner;

public class Task7_MatrixAverageCalculator {
    private static int numberOfdigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numberOfdigitArray:");
        int number = scanner.nextInt();
        return number;
    }

    private static int[][] arrayRandom(int numberOne, int numberTwo) {
        int array[][] = new int[numberOne][numberTwo];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
            }
        }
        return array;
    }

    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    //Подсчет среднего арифмитеического всех элементов массива
    private static double avg(int[][] array) {
        int sum = 0;
        int numLength = 0;
        // int lengthOne = array[0].length;
        // int lengthTwo = array[1].length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            numLength += array[i].length;

        }
        System.out.println("Проверка:");
        System.out.println("sum: " + sum);
        System.out.println("numLength: " + numLength);
        //System.out.println(lengthOne*lengthTwo);
        double avg = sum / (numLength);
        //System.out.println(avg);
        return avg;
    }
    public static void main(String[] args) {
        int numberOne = numberOfdigit();
        int numberTwo = numberOfdigit();
        int[][] array = arrayRandom(numberOne, numberTwo);
        //printMatrix(array);
        //avg(array);
        double avg = avg(array);
       // System.out.println();
       // System.out.println("avg: " + avg);
       // System.out.println("---------------------------6");
        printMatrix(array);
        System.out.println();
        avg(array);
        printMatrix(array);
    }
}


