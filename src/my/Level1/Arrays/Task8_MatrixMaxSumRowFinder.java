package my.Level1.Arrays;
/*
   Task 8 (MatrixMaxSumRowFinder)
   Прошу проверить : Написать метод поиска индекса строки с максимальной суммой элементов.
   Если таких строк несколько, вернуть индекс первой.
              Если матрица пустая (нет ни одной строки),
              бросить исключение IllegalArgumentException.
   Предполагается, что матрица прямоугольная.
   int maxSumRowIndex(int[][] matrix)
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         Пример работы есть, но у Вас я не вижу метода maxSumRowIndex. Метод принимает матрицу и возвращает индекс!
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   Пример работы:
   maxSumRowIndex(new int[][]{
   {0, 3, -2},
   {2, 50, 3},
   {-1, 5, 2}
   }) == 1
*/
//код не был отформатирован! Приучите себя не только перед коммитом форматировать, но и в процессе написания. Нажимайте Ctrl+Alt+L как можно чаще!

import java.util.*;


public class Task8_MatrixMaxSumRowFinder {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    //Ввод размеров массива array [][]:
    public static int[] arraySize() {
        int[] arraySize = new int[2];                       //было зеленым подчеркнуто!
        System.out.println("Input array size one:");
        int sizeOne = scanner.nextInt();
        arraySize[0] = sizeOne;
        System.out.println("Input array size one:");
        int sizeTwo = scanner.nextInt();
        arraySize[1] = sizeTwo;

        if (arraySize[0] == 0) {
            throw new IllegalArgumentException("You entered an invalid value++");
        }
        return arraySize;
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
            int[][] array = arrayFilingOfRandom(arraySize);
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
    public static int[][] arrayFilingOfRandom(int[] arraySize) {        //camelCase!!! слова были подчеркнуты зеленым
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

    /* Создание int [] arraySumString, где каждый элемент массива
     сумма строки массива int [][] array.*/
    public static int[] arraySumString(int[][] array) {             //camelCase!!! слова были подчеркнуты зеленым
        int[] arraySumString = new int[array.length];               //camelCase!!! слова были подчеркнуты зеленым

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySumString[i] = arraySumString[i] + array[i][j];
            }
        }
        return arraySumString;
    }

    // Метод поиска индекса строки с максимальной суммой элементов.
    //В принципе верно
    public static int idMaxArraySumString(int[] arraySumString) {       //camelCase!!! слова были подчеркнуты зеленым
        int max = arraySumString[0];                                    //индексация с нуля идет!
        // int maxNext = arraySumString[arraySumString.length - 1];
        int index = 0;
        //  int idMaxNext = 1;
        for (int i = 1; i < arraySumString.length; i++) {               //начинаем с 1, так как ранее "запомнили" нулевой элемент
            if (max < arraySumString[i]) {
                max = arraySumString[i];
                index = i;
            }
        }

        return index;
    }

    // Метод поиска индекса строки с равной максимальной суммой элементов.
    //На самом деле Вы тут находите последний максимальный элемент!
    //имена не исправлял, но тут и ранее Вы не id, а index ищите
    public static int idMaxNextArraySumString(int[] arraySumString) {     //camelCase!!! слова были подчеркнуты зеленым
        //индексация с нуля начинается. Почему тут индекс 1?
        int max1 = arraySumString[0];
        int idMax1 = 0;
        //если перебирать с конца, то Вы найдете последний элемент, который равен максимальному. Я так понял этот метод просто для проверки
        for (int i = arraySumString.length - 1; i > 0; i--) {
            if (max1 < arraySumString[i]) {
                max1 = arraySumString[i];
                idMax1 = i;
            }
        }
        return idMax1;
    }

    public static void main(String[] args) {
        int[] arraySize = arraySize();
        System.out.println(Arrays.toString(arraySize));
        int[][] array = arrayChoice(arraySize);
        int[] arraySumString = arraySumString(array);               //camelCase!!! слова были подчеркнуты зеленым
        System.out.println(Arrays.toString(arraySumString));
        int idMax = idMaxArraySumString(arraySumString);
        System.out.println(idMax);
        int idMax1 = idMaxNextArraySumString(arraySumString);
        System.out.println(idMax1);
        if (idMax != idMax1) {
            System.out.println("Not idMaxArraySumString ---  1");
        } else {
            System.out.println("idMaxArraySumString=" + idMax);
        }

    }
}

