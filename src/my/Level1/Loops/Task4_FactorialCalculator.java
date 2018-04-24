package my.Level1.Loops;

import java.util.Scanner;

/*Определение факториала заданного числа n (1..20).
Если число не соответствует диапазону,
бросить исключение IllegalArgumentException.
long factorial(int n)
*/
public class Task4_FactorialCalculator {
    private static int argument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:");
        int arg = scanner.nextInt();
        return arg;
    }

    private static long factorial(int n) {
        long f = 1;
        if (n <1 || n > 20) {
            throw new IllegalArgumentException("You entered an invalid value");
        }
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = argument();
        long f = factorial(n);
        System.out.println(f);
    }
}
