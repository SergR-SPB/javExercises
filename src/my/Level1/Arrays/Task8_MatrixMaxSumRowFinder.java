package my.Level1.Arrays;
/*
   Task 8 (MatrixMaxSumRowFinder)
   Прошу проверить : Написать метод поиска индекса строки с максимальной суммой элементов.
   Если таких строк несколько, вернуть индекс первой.
   Если матрица пустая (нет ни одной строки),
   бросить исключение IllegalArgumentException.
   Предполагается, что матрица прямоугольная.
   int maxSumRowIndex(int[][] chooseMatrix)
   Пример работы:
   maxSumRowIndex(new int[][]{
   {0, 3, -2},
   {2, 50, 3},
   {-1, 5, 2}
   }) == 1
*/

import java.util.*;

//в целом ок, но названия методов должны соответствовать тому, что они делают.

public class Task8_MatrixMaxSumRowFinder {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    //Ввод размеров массива array [][]:
    public static int[] arraySize() {
        int[] arraySise = new int[2];
        System.out.println("Input array size one:");
        int sizeOne = scanner.nextInt();
        arraySise[0] = sizeOne;
        System.out.println("Input array size one:");
        int sizeTwo = scanner.nextInt();
        arraySise[1] = sizeTwo;

        if (arraySise[0] == 0) {
            throw new IllegalArgumentException("You entered an invalid value++");
        }
        return arraySise;
    }

    //Выбор метода заполнения массива [][] chooseMatrix
    public static int[][] arrayChoice(int[] arraySize) {
        System.out.println("Choice of array filling method:");
        System.out.println("If \"1\" - console filling.");
        System.out.println("If \"2\" - random filling.");
        int n = scanner.nextInt();
        //до этого было верно, но чтоб было меньше дублирования
        int[][] matrix;
        if (n == 1) {
             matrix = arrayFillingOfConsole(arraySize);
        } else {
            matrix = arrayFilingOfRandom(arraySize);
        }
        matrixArray(matrix);
        return matrix;
    }

    //1. Заполнение массива array [][] из консоли.
    public static int[][] arrayFillingOfConsole(int[] arraySize) {
        int[][] matrix = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Input one array [" + i + "]; Input two array [" + j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    //2. Заполнение массива array[][] случайными числами.
    public static int[][] arrayFilingOfRandom(int[] arraySize) {
        int[][] matrix = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    // Вывод на печать массива arrayFilingOf... [][] и вывод ID с максимальной суммой
    //не удачное название метода
    public static void matrixArray(int[][] matrix) {
        int max = 1;        //переменная не используется (подсвечена серым). зачем оставили?
        int idMax = 1;      //переменная не используется (подсвечена серым). зачем оставили?

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

    }

    /*Метод поиска индекса строки с максимальной суммой (метод 1:int maxSumRow1Index(int[] arraySumString))*/
    public static int maxSumRow1Index(int[] arraySumString) {
        int max = arraySumString[0];
        int idMax = 0;
        for (int i = 0; i < arraySumString.length; i++) {
            if (max < arraySumString[i]) {
                max = arraySumString[i];
                idMax = i;
            }
        }
        return idMax;
    }

    /* Создание int [] arraySumString, где каждый элемент массива(для метода 1:int maxSumRow1Index(int[] arraySumString))
     сумма строки массива int [][] chooseMatrix.*/
    public static int[] arraySumString(int[][] matrix) {
        int[] arraySumString = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arraySumString[i] = arraySumString[i] + matrix[i][j];
            }
        }
        return arraySumString;
    }

    //индекс строки с максимальной суммой
    /*Метод поиска индекса строки с максимальной суммой (метод 2:int maxSumRow2Index(int[][] chooseMatrix))*/
    private static int maxSumRow2Index(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }
        int max = sumRow(matrix, 0);
        int index = 0;
        for (int i = 1; i < matrix.length; i++) {
            int sum = sumRow(matrix, i);
            if (max < sum) {
                max = sum;
                index = i;
            }
        }
        return index;
    }

    /*сумма по строке(для метода 2:int maxSumRow2Index(int[][] chooseMatrix))*/
    private static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }

    private static void test() {
        System.out.println("Test:");
        int index = maxSumRow2Index(new int[][]{
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2}
        });
        System.out.println("      maxSumRowIndex(new int[][]{\n" +
                "                {0, 3, -2},\n" +
                "                {2, 50, 3},\n" +
                "                {-1, 5, 2}\n" +
                "      }) == " + index + "\n\n");
    }


    public static void main(String[] args) {
        test();
        int[] arraySize = arraySize();
        System.out.println(Arrays.toString(arraySize));
        int[][] matrix = arrayChoice(arraySize);
        //метод 1 не соответствует условию: не бросает исключение если матрица пустая
        int[] arraySumString = arraySumString(matrix);
        System.out.println(Arrays.toString(arraySumString));
        int idMax = maxSumRow1Index(arraySumString);                    //не удачное название метода: между буквами стоят цифры и приходится "вчитываться"
        System.out.println("maxSumRowIndex (m1) == " + idMax);
        System.out.println("maxSumRowIndex (m2) == " + maxSumRow2Index(matrix));
    }
}

