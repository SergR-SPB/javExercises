package my.Level1.Arrays;

import java.util.*;

/*
1/Написать метод подсчета количества положительных чисел в массиве.
int countPositives(int[] array)

Пример работы:
countPositives(new int[]{-3, 0, -1, 4, -2, 5}) == 2
countPositives(new int[]{-3, 0, -1, -4, -2, -5}) == 0

2/Написать метод создания массива размера size, заполненного значениями от 0..(size-1). Если size < 0, бросить исключение IllegalArgumentException.
int[] createSequenceArray(int size)
*/
public class Task4_ArrayPositivesCounter {

    public static void main(String[] args) {
        // Ввод array size.
        int size = arraySize();
        // Выбор метода заполнения массива array (1-console,2 - random).
        int[] array = arrayChoice(size);
        // Нахождение количества положитеьных членов массива
        int count = countPositives(array);
        System.out.println("number of positive array members: " + count);
    }

    static Scanner scanner = new Scanner(System.in);

    //Ввод array size.
    public static int arraySize() {
        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        return size;
    }

    //1. Заполнение массива array[] с клавиатуры.
    public static int[] arrayFilling(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //2. Заполнение массива array[] случайными числами.
    public static int[] arrayFillingOfRandom(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    // Выбор метода заполнения массива array
    public static int[] arrayChoice(int size) {
        System.out.println("Choice of array filling method:");
        System.out.println("If \"1\" - console filling,");
        System.out.println("If \"2\" - random filling:");
        int n = scanner.nextInt();
        if (n == 1) {
            int[] array = arrayFilling(size);
            System.out.println(Arrays.toString(array));
            return array;
        } else {
            int[] array = arrayFillingOfRandom(size);
            System.out.println(Arrays.toString(array));
            return array;
        }
    }

    //Нахождение количества положитеьных членов массива
    public static int countPositives(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
