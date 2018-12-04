package my.Level1.Conditions;

import java.util.Scanner;

/*Определение корректности заданного возраста.
Возраст может принимать значения в диапазоне 1..120.
boolean isAge(int age)
Входные аргументы - int age
Тип результата - boolean
25	- true
0	- false
120	- true

*/
public class W2_Task2_IsAgeChecker {
    private static int readDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        return age;
    }

    private static boolean isAge(int age) {
        boolean isAge = (age >= 1 && age <= 120);
        return isAge;
    }

    public static void main(String[] arg) {
        int age = readDate();
        boolean isAge = isAge(age);
        System.out.println(isAge);
    }
}
