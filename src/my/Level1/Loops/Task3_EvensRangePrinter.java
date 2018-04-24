package my.Level1.Loops;

/*Вывод на экран чётных чисел от first до last.
Если first > last, ничего не выводить.
void printEvensRange(int first, int last)*/

import java.util.Scanner;

public class Task3_EvensRangePrinter {
    /* private static void printRange(int first, int last) {
         if (first <= last) {
             for (int i = first; i <= last; i++) {
                 if (i % 2 == 0) {
                     System.out.print(i + " ");
                 }
             }
         }
     }*/
    private static void printRange(int first, int last) {
        if (first <= last) {
            if (first % 2 == 0) {
                first = first;
            } else {
                first++;
            }
            for (int i = first; i <= last; i += 2) {
                System.out.print(i + " ");
            }
        }
    }

    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument : ");
        int arg = scanner.nextInt();
        return arg;
    }

    public static void main(String[] args) {
        int first = argument();
        int last = argument();
        printRange(first, last);
    }
}
