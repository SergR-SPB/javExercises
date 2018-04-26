package my.Level1.Arrays;
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

import java.util.*;


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

        if (arraySise[0]==0) {
            throw new IllegalArgumentException("You entered an invalid value++");
        }
        return arraySise;
    }

    //Выбор метода заполнения массива [][] array
    public static int[][] arrayChoice(int[] arraySize) {
        System.out.println("Choice of array filling method:");
        System.out.println("If \"1\" - console filling.");
        System.out.println("If \"2\" - random filling.");
        int n = scanner.nextInt();
        if (n == 1) {
            int[][] array = arrayFillingOfConsole(arraySize);
            matrixArray(array);
            return array;
        } else {
            int[][] array = arrayFilingOfrandom(arraySize);
            matrixArray(array);
            return array;
        }
    }

    //1. Заполнение массива array [][] из консоли.
    public static int[][] arrayFillingOfConsole(int[] arraySize) {
        int[][] array = new int[arraySize[0]][arraySize[1]];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Input one array [" + i + "]; Input two array [" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;
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

    // Вывод на печать массива arrayFilingOf... [][] и вывод ID с максимальной суммой
    public static void matrixArray(int[][] array) {
        int max = 1;
        int idMax = 1;

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

    }

    /* Создание int [] arraySumstring, где каждый элемент массива
     сумма строки массива int [][] array.*/
    public static int[] arraySumstring(int[][] array) {
        int[] arraySumstring = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySumstring[i] = arraySumstring[i] + array[i][j];
            }
        }
        return arraySumstring;
    }

    // Метод поиска индекса строки с максимальной суммой элементов.
    public static int idMaxarraySumstring(int[] arraySumstring) {
        int max = arraySumstring[1];
       // int maxNext = arraySumstring[arraySumstring.length - 1];
        int idMax = 1;
      //  int idMaxNext = 1;
        for (int i = 0; i < arraySumstring.length; i++) {
            if (max < arraySumstring[i]) {
                max = arraySumstring[i];
                idMax = i;
            }
        }
            /*for (int i = arraySumstring.length - 1; i >= 0; i--) {
                if (maxNext < arraySumstring[i]) {
                    maxNext = arraySumstring[i];
                    idMaxNext = i;
                }
            }
            if (idMax != idMaxNext) {
                return idMax;
            } else {
                return 100;
            }*/
        return idMax;
        }

        // Метод поиска индекса строки с равной максимальной суммой элементов.
        public static int idMax_NextarraySumstring ( int[] arraySumstring){
            int max1 = arraySumstring[1];
            int idMax1 = 1;
            for (int i = arraySumstring.length - 1; i >= 0; i--) {
                if (max1 < arraySumstring[i]) {
                    max1 = arraySumstring[i];
                    idMax1 = i;
                }
            }
            return idMax1;
        }

        public static void main (String[]args){
            int[] arraySize = arraySize();
            System.out.println(Arrays.toString(arraySize));
            int[][] array = arrayChoice(arraySize);
            int[] arraySumstring = arraySumstring(array);
            System.out.println(Arrays.toString(arraySumstring));
            int idMax = idMaxarraySumstring(arraySumstring);
            System.out.println(idMax);
            int idMax1 = idMax_NextarraySumstring(arraySumstring);
            System.out.println(idMax1);
            if (idMax != idMax1) {
                System.out.println("Not idMaxarraySumstring ---  1");
            } else {
               System.out.println("idMaxarraySumstring=" + idMax);
            }

        }
    }

