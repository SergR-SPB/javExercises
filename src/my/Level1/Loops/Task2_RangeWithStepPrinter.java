package my.Level1.Loops;
/*Вывод на экран целых чисел от first до last c шагом step.
Если вывод может привести к зацикливанию,
бросить исключение IllegalArgumentException.
void printRange(int first, int last, int step)
*/

import java.util.Scanner;

public class Task2_RangeWithStepPrinter {
    private static long argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument: ");
        long arg = scanner.nextInt();
        return arg;
    }
    private static void printRange(long first, long last, long step) {
        if (first < last && step > 0 ) {
            for (long i = first; i <= last; i = i + step) {
                System.out.print(i + " ");
            }
        } else if (first > last && step < 0 ) {
            for (long i = first; i >= last; i = i + step) {
                System.out.print(i + " ");
            }
        } else {
            throw new IllegalArgumentException("You entered an invalid value");
        }
    }



    public static void main(String[] args) {
        long first = argument();
        long last = argument();
        long step = argument();
        printRange(first, last, step);
    }
}
