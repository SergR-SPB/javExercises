package my.Level1.Conditions;

import java.util.Scanner;

public class Task1_MinMaxCalculator {
    private static int argumentOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:  ");
        return scanner.nextInt();
    }

    private static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else if (a < b){
            return b;
        } else {
            return 0;
        }
    }

    private static int min(int a, int b) {
        if (a > b) {
            return b;
        } else return a;
    }


    public static void main(String[] arg) {
        Task1_MinMaxCalculator task1_minMaxCalculator = new Task1_MinMaxCalculator();

        int a = argumentOne();
        int b = argumentOne();
        int max = max(a, b);
        int min = min(a, b);
        if (a != b) {
            System.out.println("MAX numeric: " + max);
            System.out.println("MIN numeric: " + min);
        } else {
            System.out.println("a equal b");
        }
    }
}




