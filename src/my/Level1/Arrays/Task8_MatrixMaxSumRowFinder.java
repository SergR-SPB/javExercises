package my.Level1.Arrays;
/*
   Task 8 (MatrixMaxSumRowFinder)
   Написать метод поиска индекса строки с максимальной суммой элементов.
   Если таких строк несколько, вернуть индекс первой.
   Если матрица пустая (нет ни одной строки),
   бросить исключение IllegalArgumentException.
   Предполагается, что матрица прямоугольная.
   int maxSumRowIndex(int[][] matrix)
   Пример работы:
   maxSumRowIndex(new int[][]{
   {0, 3, -2},
   {2, 50, 3},
   {-1, 5, 2}
   }) == 1
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8_MatrixMaxSumRowFinder {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    //Ввод размеров массива array [][]:
    public static int[] arraySize() {
        int[] arraySise = new int[2];
        System.out.println("Input array size one");
        int sizeOne = scanner.nextInt();
        arraySise[0] = sizeOne;
        System.out.println("Input array size one");
        int sizeTwo = scanner.nextInt();
        arraySise[1] = sizeTwo;
        return arraySise;
    }

    //1. Заполнение массива array [][] из консоли.
    public static int[][] arrayFillingOfConsole(int[] arraySize) {
        int[][] ar1ray = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < ar1ray.length; i++) {
            for (int j = 0; j < ar1ray[i].length; j++) {
                System.out.println("Input one array [" + i + "]; Input two array [" + j + "]");
                ar1ray[i][j] = scanner.nextInt();
            }
        }
        /*int[][] matrix = new int[arraySize[0]][arraySize[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Input matrix row " + i + " element no: " + j + " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }*/
        //System.out.println(Arrays.deepToString(array));
        return ar1ray;
    }

    //2. Заполнение массива array[][] случайными числами.
    public static int[][] arrayFilingOfrandom(int[] arraySize) {
        int[][] array = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }

    // Вывод на печать массива arrayFilingOf [][]
    public static void matrixArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arraySize = arraySize();
        System.out.println(Arrays.toString(arraySize));
        int[][] arrayFilingOfrandom = arrayFilingOfrandom(arraySize);
        matrixArray(arrayFilingOfrandom);
        int[][] arrayFillingOfConsole = arrayFillingOfConsole(arraySize);
        //System.out.println(Arrays.deepToString(arrayFillingOfConsole));
    }
}
