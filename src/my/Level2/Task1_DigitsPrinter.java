package my.Level2;

//тут имя пакета должно быть другим: my.Level2.ConditionsLoops
//в IDEA создайте соответствующий пакет и переместите туда этот файл (на файле нажать F6 и выбрать пакет для перемещения)

import java.util.Scanner;

/*Вывод в консоль цифр целого числа.  Если число отрицательное, вывести знак «-».
Использование преобразования числа в строку запрещено.
void outputDigits(int n)
Входные аргументы: int. Тип результата: Вывод на экран
Пример
Входные аргументы |  Результат
------------------|----------------
       147292	  |   1 4 7 2 9 2
------------------|----------------
      -147292	  | - 1 4 7 2 9 2

*/
public class Task1_DigitsPrinter {
    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        return n;
    }

//     Как включить эти два метода в код, чтобы scanner не вызывался повторно
//       при сохранении условия: void outputDigits(int n)

    public static int numberOfCharacters(int numbers) {
        int numberOfCharacters = 0;
        for (int i = numbers; i > 0; i = i / 10) {
            numberOfCharacters++;
        }
        return numberOfCharacters;
    }

    public static int zeroMultiplier(int numberOfCharacters) {
        int zeroMultiplier = 10;
        for (int i = 1; i < numberOfCharacters; i++) {
            zeroMultiplier = zeroMultiplier * 10;
        }
        return zeroMultiplier; // int n;
    }

    public static void outputDigits(int n) {
        if (n < 0) {
            n = -1 * n;
            System.out.print("- ");
        }
        int numberOfCharacters = numberOfCharacters(n);
        int zeroMultiplier = zeroMultiplier(numberOfCharacters);
        for (int i = n; i > 0; i = i / 10) {//число знаков
            numberOfCharacters++;
        }
//      Можно было просто в степень возвести  zeroMultiplier = (int) Math.pow(10, numberOfCharacters);
        /*for (int i = 1; i < numberOfCharacters; i++) {//10^числа знаков
            zeroMultiplier = zeroMultiplier * 10;
        }*/
        if (n < 0) {                    //в этом месте n не может быть отрицательным из-за первого if'а данного метода
            System.out.print("- ");
        }
        for (int i = 10; i <= zeroMultiplier; i = i * 10) {
            //почему не использовать остаток от деления?
            int numberOne = n / (zeroMultiplier / i);
            System.out.print(numberOne + " ");
            int numberLast = numberOne * zeroMultiplier / i;
            n = n - numberLast;
        }
        System.out.println(" end");
    }

    public static void outputDigitsExample(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        if (n == Integer.MIN_VALUE) {
            System.out.println("- 2 1 4 7 4 8 3 6 4 8");
            return;
        }
        String result = "";
        boolean negativeNumber = n < 0;
        n = Math.abs(n);
        while (n > 0) {
            result = (n % 10) + " " + result;
            n /= 10;
        }
        if (negativeNumber) {
            result = "- " + result;
        }
        System.out.println(result);
    }

    public static void outputDigitsWithoutString(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        if (n == Integer.MIN_VALUE) {
            System.out.println("- 2 1 4 7 4 8 3 6 4 8");
            return;
        }
        if (n < 0) {
            System.out.print("- ");
            n *= -1;
        }
        long multiple = 1;
        while (10 * multiple <= n) {
            multiple *= 10;
        }
        while (multiple > 0) {
            System.out.print(n / multiple + " ");
            n %= multiple;
            multiple /= 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = inputNumber();
        System.out.println("You entered a number: " + n);
        outputDigits(n);                    //проблемы будут если ввести граничные значения: Integer.MAX_VALUE или Integer.MIN_VALUE
        outputDigitsExample(n);
        outputDigitsWithoutString(n);
    }
}
