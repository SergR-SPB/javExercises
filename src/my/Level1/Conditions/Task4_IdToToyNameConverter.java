package my.Level1.Conditions;
/*Определение названия детской игрушки по ее идентификатору.
Если данной игрушки нет, бросить исключение IllegalArgumentException.
Реализовать с помощью if-else цепочки.
Виды игрушек:
0 – Car.
1 – Lego.
2 – Doll.
3 – Puzzle.
String ToyName(int id)
*/

import java.util.Scanner;

public class Task4_IdToToyNameConverter {

    private static int argumentOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:");
        int id = scanner.nextInt();
        return id;
    }

    public static String toyName(int id) {
        String name;
        if (id >= 0 && id <= 3) {
            if (id == 0) {
                name = "Car";
            } else if (id == 1) {
                name = "Lego";
            } else if (id == 2) {
                name = "Dool";
            } else {
                name = "Puzzle";
            }
            return name;
        } else {
            throw new IllegalArgumentException("You entered an invalid value");
        }
    }

    public static void main(String[] args) {
        int id = argumentOne();
        String name = toyName(id);
        System.out.println(name);
    }
}
