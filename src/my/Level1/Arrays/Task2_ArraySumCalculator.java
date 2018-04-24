package my.Level1.Arrays;
/*  Написать метод вычисления суммы всех элементов массива.
int sum(int[] array)
Пример работы:
sum(new int[]{2, 1, 3}) == 6
Замечания : Task2_ArraySumCalculator
По условию метод sum называется и параметры другие.
Исправлено    */

import java.util.*;

public class Task2_ArraySumCalculator {

    static Scanner scanner = new Scanner(System.in);

    private static int arraySize() {
        System.out.println("Input array size:");
        int number = scanner.nextInt();
        return number;
    }

    private static int[] arrayАrgument(int n) {
        int array1[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int a = 0; a < n; a++) {
            System.out.println("Input array [" + a + "]");
            array1[a] = scanner.nextInt();
            //System.out.println(array1[a]);
        }
        return array1;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = arraySize();
        int[] array = arrayАrgument(n);
        System.out.println(Arrays.toString(array));
        int sum = sum(array);
        System.out.println(sum);
    }
}