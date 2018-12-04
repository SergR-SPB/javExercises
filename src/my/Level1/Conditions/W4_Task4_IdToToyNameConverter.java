package my.Level1.Conditions;

import java.util.Scanner;

/*
Определение названия детской игрушки по ее идентификатору.
Если данной игрушки нет, бросить исключение IllegalArgumentException.
Реализовать с помощью if-else цепочки.

Виды игрушек:
0 – Car.
1 – Lego.
2 – Doll.
3 – Puzzle.
String getToyName(int id)
Входные аргументы	   int id
Тип результата         String
Пример
Входные аргументы	Результат
       2	         “Doll”
      -1	         IllegalArgumentException
*/
public class W4_Task4_IdToToyNameConverter {
    private static int enterArgument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number toys:");
        //int id = scanner.nextInt();
        return scanner.nextInt();
    }

    private static String getToyName(int id) {
        String name;
        if (id >= 0 && id <= 3) {
            if (id == 0) {
                name = "Car";
            } else if (id == 1) {
                name = "Lego";
            } else if (id == 2) {
                name = "Dolli";
            } else {
                name = "Puzzle";
            } return name;
        } else {
            throw new IllegalArgumentException("You entered invalid value!");
        }
    }

    public static void main(String[] args) {
        int id=enterArgument();
        String name = getToyName(id);
        System.out.println(name);
    }
}
