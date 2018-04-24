package my.Level1.Loops;
/*Вывод на экран целых чисел от first до last.
void printRange(int first, int last)*/

import java.util.Scanner;

public class Task1_RangePrinter {
    private static void printRange(int first, int last) {
        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(+i + " ");
            }
        } else {
            for (int i = first; i >= last; i--) {
                System.out.print(+i + " ");
            }
        }
    }

    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument: ");
        int arg = scanner.nextInt();
        return arg;
    }

    public static void main(String[] args) {
        int first = argument();
        int last = argument();
        printRange(first, last);
    }
}
