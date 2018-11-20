package my.Level1.Arrays;
/*Написать метод транспонирования матрицы.
Исходная матрица не должна изменяться. Предполагается, что матрица прямоугольная.
https://ru.wikipedia.org/wiki/Транспонированная_матрица
"" Формально, транспонированная матрица для матрицы A размеров MxN — матрица At размеров NxM,
определённая как A_ij=At_ji,
т.е. для получения транспонированной матрицы из исходной
нужно каждую строчку исходной матрицы записать в виде столбца в том же порядке.""
int[][] transpose(int[][] sourceMatrix)

Пример работы:
transpose(new int[][] {
{1, 2, 3, 4},
{5, 6, 7, 8}
}) => {
{1, 5},
{2, 6},
{3, 7},
{4, 8}
}

*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//метод для транспонирования верный. с вводом-выводом намудрили...
public class Task9_MatrixTransposer {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        test();                             //достаточно было код из test() разместить в main()
        //если хотели делать ручной ввод или случайную матрицу, то не плоходы было показать в консоле результат работы.
        //а то код ниже выполнится, но результат пользователь не увидет.
        int[] arraySize = arraySize();     //1. Ввод размеров массива [sizeOne][sizeTwo] chooseMatrix;
        //System.out.println("Size chooseMatrix[][] = " + Arrays.toString(arraySise));
        int[][] sourceMatrix = matrix(arraySize); // 2. Выбор способа заполнения,  формирование массива [][] chooseMatrix и вывод на консоль
        int[][] transpose = transpose(sourceMatrix); //3. Транспонирование int[][] transpose(int[][] sourceMatrix)
    }

    // Test.
    private static void test() {
        System.out.println("Test:");
        System.out.println("matrixTest(new int[][]{\n" +
                "{1, 2, 3, 4},\n" +
                "{5, 6, 7, 8}\n");
        System.out.println("matrixTransposeTest:");
        int[][] source = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int[][] result = transpose(source);

        System.out.println("--------------------------");
        System.out.println("source:\n" + Arrays.deepToString(source));
        System.out.println("\nresult:\n" + Arrays.deepToString(result));
    }

    //3. Транспонирование int[][] transpose(int[][] sourceMatrix)
    //метод должен только транспонировать. можете выводить какую-то информацию для себя чтоб легче было отлаживать программу, но после удаляйте лишнее
    //вызывая метод для транспонирования пользователь не ожидает (и не факт что хочет) чтобы метод еще что-то и на печать выводил
    public static int[][] transpose(int[][] sourceMatrix) {

        int[][] transpose = new int[sourceMatrix[0].length][sourceMatrix.length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = sourceMatrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }

    //1. Ввод размеров массива [sizeOne][sizeTwo] chooseMatrix;
    public static int[] arraySize() {
        int[] arraySize = new int[2];
        System.out.println("Input array size one:");
        int sizeOne = scanner.nextInt();
        arraySize[0] = sizeOne;
        if (sizeOne == 0) {
            throw new IllegalArgumentException("You entered an invalid value++");
        }
        System.out.println("Input array size two:");
        int sizeTwo = scanner.nextInt();
        arraySize[1] = sizeTwo;
        System.out.println("Size chooseMatrix[][] = " + Arrays.toString(arraySize));
        System.out.println();
        return arraySize;
    }

    // 2. Выбор способа заполнения, формирование массива [][] chooseMatrix и вывод на консоль
    public static int[][] matrix(int[] arraySize) {

        int[][] matrix = new int[arraySize[0]][arraySize[1]];
        System.out.println("Choice of array filing method:");
        System.out.println("If \"1\" - console method.");
        System.out.println("If \"2\" - random method.");
        int m = scanner.nextInt();
        System.out.println("---------------------------");
        if (m == 1) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.println();
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("Input one array [" + i + "]; input two array [" + j + "]  ");
                    matrix[i][j] = scanner.nextInt();
                    //System.out.print(chooseMatrix[i][j] + " ");// неполучилось!!!!!!!!!1
                }
            }
            System.out.println(Arrays.deepToString(matrix));
            System.out.println();
            return matrix;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(10);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return matrix;
        }
    }

    //2.0 Выбор способа заполнения массива [][] chooseMatrix и вывод на консоль
    public static int[][] arrayChoice(int[] arraySize) {
        System.out.println("Choice of array filing method:");
        System.out.println("If \"1\" - console method.");
        System.out.println("If \"2\" - random method.");
        int m = scanner.nextInt();
        if (m == 1) {
            int[][] matrix = consoleMatrix(arraySize);
            printMatrix(matrix);
            return matrix;
        } else {
            int[][] matrix = randomMatrix(arraySize);
            printMatrix(matrix);
            return matrix;
        }
    }

    // 2.1. Заполнение массива [][]chooseMatrix случайнами цифрами.
    public static int[][] randomMatrix(int[] arraySize) {
        int[][] randomMatrix = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = random.nextInt(5);
            }
        }
        return randomMatrix;
    }

    // 2.2. Заполнение массива [][]chooseMatrix с консоли.
    public static int[][] consoleMatrix(int[] arraySize) {
        int[][] consoleMatrix = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < consoleMatrix.length; i++) {
            for (int j = 0; j < consoleMatrix[i].length; j++) {
                System.out.print("Input one array [" + i + "]; input two array [" + j + "]  ");
                consoleMatrix[i][j] = scanner.nextInt();
            }
        }
        return consoleMatrix;
    }

    // 2.3. Вывод массива [][] chooseMatrix на консоль
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }


}