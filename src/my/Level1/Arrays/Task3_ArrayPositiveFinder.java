package my.Level1.Arrays;
/*
Написать методы поиска индекса первого и
последнего положительного числа.
Если положительных чисел нет, вернуть -1.
int findFirstPositiveElemIndex(int[] array)
int findLastPositiveElemIndex(int[] array)
Замечание:
Task3_ArrayPositiveFinder
В принципе ок. Попробуйте переписать findFirstPositiveElemIndex и
findLastPositiveElemIndex без if'ов и используя только цикл while.
В названии методов принято вставлять глаголы.
Т.е. метод array лучше назвать fillArray, randomFillArray...
 */

import java.util.*;

public class Task3_ArrayPositiveFinder {
    static Scanner scanner = new Scanner(System.in);
    //Ввод с консоли величины массива
    private static int arraySize() {
        System.out.println("Input array size:");
        int number = scanner.nextInt();
        return number;
    }

    //Заполнение массива случайными числами
    private static int[] randomFillarray(int number) {
        int array[] = new int[number];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5)-1;
        }
        return array;
    }
    // Подсчет количества положительных ID членов массива
    private  static int countPositives(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum++;
            }
        }
        return sum;
    }

    //Поиск индекса первого положительного числа в массиве
    private static int findFirstPositiveElemIndex(int[] array) {
        int index = 0;
        /*for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }*/
        index = -1;
        int i = 0;

        while (i < array.length && array[i] > 0) {
            index = i;
            break;
        }
        i++;
        return index;
    }

    //Поиск индекса последнего положительного числа в массиве
    private static int findLastPositiveElemIndex(int[] array) {
        int index = -1;
        int i = array.length-1;

        while (i >= 0 && array[i] > 0) {
            index = i;
            break;
        }
        i--;
        return index;
    }

    public static void main(String[] args) {
        int number = arraySize();
        int[] array = randomFillarray(number);
        int indexOne = findFirstPositiveElemIndex(array);
        int indexTwo = findLastPositiveElemIndex(array);
        System.out.println(Arrays.toString(array));
        System.out.println(indexOne + " | " + indexTwo);

        int sum =  countPositives(array);
        System.out.print(sum);
    }
}
