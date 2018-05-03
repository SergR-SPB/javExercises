package my.Level1.Arrays;
/*Task 10 (IdentityMatrixChecker)
        Написать метод определения, является ли матрица единичной.
        Исходная матрица не должна изменяться. Предполагается,
        что матрица прямоугольная. Если матрица НЕ квадратная,
        бросить исключение IllegalArgumentException.
        https://ru.wikipedia.org/wiki/Единичная_матрица
        boolean isIdentity(int[][] matrix)
        ---------------------------
        wiki:::
        Едини́чная ма́трица — квадратная матрица, элементы главной диагонали которой
        равны единице поля, а остальные равны нулю.
        Условие:
        int [i][j] = 1; при i==j.
        int [i][j] = 0; при i!=j.
        int.length == int[i].length
        -------------------------------

        Пример работы:
        isIdentity(new int[][]{
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}
        }) == true

        isIdentity(new int[][]{
        {1, 0, 2},
        {0, 1, 0},
        {2, 0, 1}
        }) == false

        isIdentity(new int[][]{
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1},
        {0, 0, 0}
        }) -> IllegalArgumentException*/


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10_IdentityMatrixChecker {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        test1();                   //1. Тест
        test2();
        //test3();
        int[][] ints = matrix();   // 3. Выбор тестовой матрицы для проверки.
        boolean isIdentity = isIdentity(ints); // 2.Анализ тестовых матриц на соответствие Единичной матрице
        System.out.println(isIdentity);
    }

    // 1. Test:
    public static void test1() {
        System.out.println("test1:");
        boolean isIdentity = isIdentity(new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        }); // == true;

        System.out.println(
                "                {1, 0, 0},\n" +
                        "                {0, 1, 0},\n" +
                        "                {0, 0, 1}\n" +
                        "      }) == " + isIdentity + "\n\n");
    }

    public static void test2() {
        System.out.println("test2:");
        boolean isIdentity = isIdentity(new int[][]{
                {1, 0, 2},
                {0, 1, 0},
                {2, 0, 1}
        }); // == false;
        System.out.println(
                "                {1, 0, 2},\n" +
                        "                {0, 1, 0},\n" +
                        "                {2, 0, 1}\n" +
                        "      }) == " + isIdentity + "\n\n");
    }

    public static void test3() {
        System.out.println("test3:");
        boolean isIdentity = isIdentity(new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {0, 0, 0}
        });    //-> IllegalArgumentException*/
        System.out.println(
                "                {1, 0, 0},\n" +
                        "                {0, 1, 0},\n" +
                        "                {0, 0, 1},\n" +
                        "                {0, 0, 0}\n" +
                        "      }) == ");
    }


    // 2. Анализ тестовых матриц на соответствие Единичной матрице
    //Как решить через определение boolean isIdentity = (ints[i][j] == 1 & i == j | ints[i][j] == 0 & i != j);
    //Почему не получается так:
    /*for (int i = 0; i < ints.length; i++) {
        for (int j = 0; j < ints[i].length; j++) {
            if (ints[i][j] == 1 && i == j || ints[i][j] == 0 && i != j) {
                return true;
            }
        }
    }
        return false;*/

    public static boolean isIdentity(int[][] ints) {


        System.out.println(Arrays.deepToString(ints));

        for (int i = 0; i < ints.length; i++) {
            if (ints.length != ints[i].length) {
                throw new IllegalArgumentException("Matrix is not square");
            }
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] != 1 && i == j || ints[i][j] != 0 && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    // 3. Выбор тестовой матрицы для проверки.
    public static int[][] matrix() {
        System.out.print("Input № test task:   \n" +

                " № 1        {1, 0, 0},\n" +
                "             {0, 1, 0},\n" +
                "             {0, 0, 1}\n\n" +

                " № 2        {1, 0, 2},\n" +
                "             {0, 1, 0},\n" +
                "             {2, 0, 1}\n\n" +

                " № 3        {1, 0, 0},\n" +
                "             {0, 1, 0},\n" +
                "             {0, 0, 1},\n" +
                "             {0, 0, 0}\n\n" +
                "  Input №:_____ ");
        int num = scanner.nextInt();

        if (num == 1) {
            int[][] matrix = new int[][]{
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}
            };
            return matrix;
        } else if (num == 2) {
            int[][] ints = new int[][]{
                    {1, 0, 2},
                    {0, 1, 0},
                    {2, 0, 1}
            };
            return ints;
        } else /*if (num == 3)*/{
            throw new IllegalArgumentException("Matrix is not square");
        } /*else {
            Task9_MatrixTransposer.arraySize();
            throw new IllegalArgumentException("Is not testing №!");
        }*/
        // Как вставить продолжение (собственный выбор матрицы
        // Task9_MatrixTransposer.arraySize();) принимая во внимание
        // капризность return ints;
    }
}
