package my.Level1.Arrays;
/*Task 10 (IdentityMatrixChecker)
        Написать метод определения, является ли матрица единичной.
        Исходная матрица не должна изменяться. Предполагается,
        что матрица прямоугольная. Если матрица НЕ квадратная,
        бросить исключение IllegalArgumentException.
        https://ru.wikipedia.org/wiki/Единичная_матрица
        boolean isIdentity(int[][] chooseMatrix)
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

//старайтесь не называть переменные и методы одинаково. это ухудшает читаемость.
public class Task10_IdentityMatrixChecker {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        test1();                   //1. Тест
        test2();
        //test3();
        int[][] matrix = chooseMatrix();   // 3. Выбор тестовой матрицы для проверки.
        System.out.println("Matrix\n" + Arrays.deepToString(matrix));
        boolean isIdentity = isIdentity(matrix); // 2.Анализ тестовых матриц на соответствие Единичной матрице
        System.out.println("isIdentity == " + isIdentity);
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
    //почитайте про |, & и ||, && - это разные операторы http://www.quizful.net/interview/java/java-interview
    //Как решить через определение boolean isIdentity = (ints[i][j] == 1 & i == j | ints[i][j] == 0 & i != j);
    //не понял зачем isIdentity?
    //Почему не получается так:
    /*for (int i = 0; i < ints.length; i++) {
        for (int j = 0; j < ints[i].length; j++) {
            if (ints[i][j] == 1 && i == j || ints[i][j] == 0 && i != j) {
                return true;
            }
        }
    }
        return false;*/
    //по условию было boolean isIdentity(int[][] chooseMatrix) - зачем выдумывать новое название для параметра (ints)?
    public static boolean isIdentity(int[][] ints) {


        System.out.println(Arrays.deepToString(ints));

        for (int i = 0; i < ints.length; i++) {
            if (ints.length != ints[i].length) {
                throw new IllegalArgumentException("Matrix is not square");
            }
            for (int j = 0; j < ints[i].length; j++) {
                if ((ints[i][j] != 1 && i == j)
                        || (ints[i][j] != 0 && i != j)) {   //
                    return false;
                }
            }
        }
        return true;
    }

    // 3. Выбор тестовой матрицы для проверки.
    public static int[][] chooseMatrix() {
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
                " № 4        Random matrix\n\n " +
                " № 5        Identity matrix\n\n" +
                "  Input №:_____ ");
        int num = scanner.nextInt();

        int[][] matrix;
        if (num == 1) {
            matrix = new int[][]{
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}
            };
        } else if (num == 2) {
            matrix = new int[][]{
                    {1, 0, 2},
                    {0, 1, 0},
                    {2, 0, 1}
            };
        } else if (num == 3) {
            matrix = new int[][]{
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1},
                    {0, 0, 0}
            };
        } else if (num == 4) {
            matrix = randomMatrix(6, 6);
        } else if (num == 5) {
            matrix = identityMatrix(6);
        } else {
            throw new IllegalArgumentException("Matrix is not square");
        }
        /*else {
            Task9_MatrixTransposer.arraySize();
            throw new IllegalArgumentException("Is not testing №!");
        }*/
        // Как вставить продолжение (собственный выбор матрицы              продолжить цепочку if-else. Не пойму почему проблемы возникли
        // Task9_MatrixTransposer.arraySize();) принимая во внимание
        // капризность return ints;         что значит капризность? Вы объявили какой тип будете возвразать. в return передаете именно то, что объявили
        return matrix;
    }

    private static int[][] identityMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    private static int[][] randomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
        return matrix;
    }
}
