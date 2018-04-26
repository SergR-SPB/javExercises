package my.Level1.Arrays;

import java.util.Random;

public class Task8_Primer {

/*
   Task 8 (MatrixMaxSumRowFinder)
   Прошу проверить : Написать метод поиска индекса строки с максимальной суммой элементов.
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


    public static void main(String[] args) {
        test();

        int[][] matrix = generate(5, 3);
        print(matrix);
        System.out.println("maxSumRowIndex == " + maxSumRowIndex(matrix));
    }

    //этот метод скопируйте себе в код и вставьте первой строкой в main.
    // Должны получить то, что указано в примере в условии
    private static void test() {
        System.out.println("Test:");
        int index = maxSumRowIndex(new int[][]{
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

    //создаем массив
    private static int[][] generate(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(30);
            }
        }

        return matrix;
    }

    //вывод массива на экран
    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //индекс строки с максимальной суммой
    private static int maxSumRowIndex(int[][] matrix) {
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

    //сумма по строке
    private static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }
}


