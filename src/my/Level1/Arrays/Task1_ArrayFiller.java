package my.Level1.Arrays;
/*   Написать метод заполнения массива array указанным значением filler.
     void fill(int[] array, int filler)
     Пример работы: fill(new int[5], 20) => {20, 20, 20, 20, 20}
     Замечание:
     *Task1_ArrayFiller
     * Ввел 3 и 5. Получил ArrayIndexOutOfBoundsException
     * Нарушена сигнатура метода fill
     *Исправлено
     */

import java.util.*;


public class Task1_ArrayFiller {

    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    private static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("Input array size argument:");
        int a = argument();
        System.out.println("Input array filler argument:");
        int filler = argument();
        int array[] = new int[a];
        fill(array, filler);
    }
}
