package my.Level1.NewConditions;

import java.util.Scanner;

/*
        1.  Вводятся  два  целых числа.
        Проверить делится ли первое на второе.
        Вывести на экран сообщение об этом,
        а также остаток (если он есть) и частное (в любом случае).
       ** Разделил все на методы для тренировки :))**
*/
public class Task1_New {
    private static double argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:");
        double i = scanner.nextDouble();
        return i;
    }
    private static double divideByargument(double a, double b) {
        double x = a / b;
        return x;
    }
    private static double remainderOfdivisionArgument(double a, double b) {
        double y = a % b;
        return y;
    }
    public static void main(String[] args) {
        double a = argument();
        double b = argument();
        double x = divideByargument(a, b);
        double y = remainderOfdivisionArgument(a, b);
        if (y != 0) {
            System.out.println("doesn't share without the rest");
            System.out.println(a + " / " + b + " = " + x + ", remainder of division: " + y);
        } else {
            System.out.println(a + " / " + b + " = " + x);
        }
    }
}
