package my.Level1.NewConditions;
/*
2. Определить, является ли год,
который ввел пользователем, високосным или невисокосным.
int year = 2024;
        if (year%4!=0){
            System.out.println("Year: "+year + ", is not Leap-year.");
        }else {
            System.out.println("Year: "+year + ", is Leap-year.");
        }
 */

import java.util.Scanner;

public class Task2_Leapyear {
    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        int year = scanner.nextInt();
        return year;
    }

    private static boolean leapYear(int year) {
        boolean leap = (year % 4 == 0);
        return leap;
    }

    public static void main(String[] args) {
        int year = argument();
        boolean leap = leapYear(year);

        if (leap == true) {
            System.out.println("Year: " + year + ", is Leap-year.");
        } else {
            System.out.println("Year: " + year + ", is not Leap-year.");
        }
    }
}
