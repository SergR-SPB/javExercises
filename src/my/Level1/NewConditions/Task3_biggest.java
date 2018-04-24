package my.Level1.NewConditions;
/*
    3.  Вводятся  три  целых  числа.  Определить  какое из них наибольшее.
        (в  main  считывайте  числа и передавайте ее в свою функцию
        static int biggest(int a, int b, int c) )
*/

import java.util.Scanner;

public class Task3_biggest {
    /*public static void main(String[] args) {
        int a=7;
        int b=9;
        int c=3;
        if (a<b||a<c) {
            if (b<c){
                int max = c;
                System.out.println(max);
            }else {
                int max = b;
                System.out.println(max);
            }
        }
         else {
            int max = a;
            System.out.println(max);
        }
    }*/
    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:");
        int i = scanner.nextInt();
        return i;
    }
    private static int biggest(int a, int b, int c){
        if (a<b||a<c) {
            if (b<c){
                int max = c;
                return max;
            }else {
                int max = b;
                return max;
            }
        } else {
            int max = a;
            return max;
        }
    }

    public static void main(String[] args) {
        int a=argument();
        int b=argument();
        int c=argument();
        int max = biggest( a,  b,  c);
        System.out.println("MAX number: "+max );
    }
}
