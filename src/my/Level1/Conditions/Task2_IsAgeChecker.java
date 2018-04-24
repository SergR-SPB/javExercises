package my.Level1.Conditions;

import java.util.Scanner;
/*Определение корректности заданного возраста.
Возраст может принимать значения в диапазоне 1..120.
boolean isAge(int age)*/
public class Task2_IsAgeChecker {
    private static int readData (){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Input argument: ");
        int age = scaner.nextInt();
        return age;
        //return scaner.nextInt();
    }
    private static boolean isAge(int age) {
        boolean isAge = (age>=1&&age<=120);
        return isAge;
    }
    public static void main (String[] arg){
        int age = readData ();
        boolean isAge=isAge(age);
        System.out.println(isAge);
    }
}
