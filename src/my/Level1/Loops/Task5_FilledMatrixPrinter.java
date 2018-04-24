package my.Level1.Loops;
/*Вывод на экран матрицы rows * cols, заполненной filler.
Если rows < 0 или cols < 0,
бросить исключение IllegalArgumentException.
void printFilledMatrix(int rows, int cols, int filler)
*/

import java.util.Scanner;

public class Task5_FilledMatrixPrinter {
    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:");
        int arg = scanner.nextInt();
        return arg;
    }

    private static void printFilledMatrix(int rows, int cols, int filler) {
        if (rows >= 0 && cols >= 0) {
            for (int i = 1; i <= rows; i++) {
                for (int x = 1; x <= cols; x++) {
                    System.out.print(filler + " ");
                }
                System.out.println();
            }
        } else {
            throw new IllegalArgumentException("You entered an invalid value");
        }
    }

    public static void main(String[] args) {
        int rows = argument();
        int cols = argument();
        int filler = argument();
        printFilledMatrix(rows, cols, filler);
    }
}
