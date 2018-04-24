package my.Level1.Conditions;
/*Определение идентификатора детской игрушки по ее названию (задача, обратная к Task 4).
Если данной игрушки нет, бросить исключение IllegalArgumentException.
Реализовать с помощью switch-case.
Виды игрушек:
0 – Car.
1 – Lego.
2 – Doll.
3 – Puzzle.
String getToyName(int id)*/

import java.util.Scanner;

public class Task5_ToyNameToIdConverter {

    private static String readData() {
        Scanner sk = new Scanner(System.in);
        String txtA = "Argument(Car,Lego,Doll,Puzzle or other): ";
        System.out.println(txtA);
        String nameToy = sk.next();
        return nameToy;
    }

    //  метод if
    private static int nameIfToyId(String nameToy) {
        int nameToyId;
        if (nameToy.equals("Car")) {
            nameToyId = 0;
        } else if (nameToy.equals("Lego")) {
            nameToyId = 1;
        } else if (nameToy.equals("Doll")) {
            nameToyId = 2;
        } else if (nameToy.equals("Puzzle")) {
            nameToyId = 3;
        } else {
            throw new IllegalArgumentException("You entered an invalid value");
        }
        return nameToyId;
    }

    // switch-case
    private static int nameSwitchToyId(String nameToy) {
        int nameToyId;
        switch (nameToy) {
            case "Car":
                nameToyId = 0;
                break;
            case "Lego":
                nameToyId = 1;
                break;
            case "Doll":
                nameToyId = 2;
                break;
            case "Puzzle":
                nameToyId = 3;
                break;
            default:
                throw new IllegalArgumentException("You entered an invalid value");
        }
        return nameToyId;
    }

    public static void main(String[] args) {
        String nameToy = readData();
        int name1 = nameSwitchToyId(nameToy);
        System.out.println("Result (nameSwitchToyId): " + name1);
        int name = nameIfToyId(nameToy);
        System.out.println("Result (nameIfToyId): " + name);
    }
}

