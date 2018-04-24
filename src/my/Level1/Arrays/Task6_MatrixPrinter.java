package my.Level1.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Написать метод вывода матрицы в консоль.
Предполагается, что матрица прямоугольная.
void printMatrix(int[][] matrix)
*/
public class Task6_MatrixPrinter {
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
                array[i][j] = random.nextInt(7);
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

    public static void main(String[] args) {
        int numberOne = numberOfdigit();
        int numberTwo = numberOfdigit();
        int[][] array = arrayRandom(numberOne, numberTwo);
        printMatrix(array);
    }
}
