package my.Level1.Conditions;
/*Нахождение минимума/максимума двух чисел.
int max(int a, int b)
int min(int a, int b)
Входные аргументы: int a, int b
Тип результата: int/int
Пример
Входные аргументы:
5, -2
Результат:
max = 5, min = -2 */


import java.util.Scanner;

public class W1_Task1_MinMaxCalculator {


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




