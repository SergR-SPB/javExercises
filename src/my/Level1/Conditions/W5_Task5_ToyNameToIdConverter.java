package my.Level1.Conditions;

import java.util.Scanner;

/*Определение идентификатора детской игрушки по ее названию
(задача, обратная к Task 4). Если данной игрушки нет,
бросить исключение IllegalArgumentException. Реализовать с помощью switch-case.

Виды игрушек:
0 – Car.
1 – Lego.
2 – Doll.
3 – Puzzle.
 String getToyName(int id)
Входные аргументы String name
Тип результата 	int
Пример
Входные аргументы	Результат
“Doll”	2
“Hello”	IllegalArgumentException
*/
public class W5_Task5_ToyNameToIdConverter {
    private static String readDate() {
        Scanner scanner = new Scanner(System.in);
        String txt = "Input argument (Car, Lego, Dolli, Puzzle or other): ";
        System.out.println(txt);
        //String name = scanner.next();


        return scanner.next();
    }

    //if.
    private static int getToyNameIf(String id) {
        int idToy;
        if (id.equals("Car")) {
            idToy = 0;
        } else if (id.equals("Lego")) {
            idToy = 1;
        } else if (id.equals("Dolli")) {
            idToy = 2;
        } else if (id.equals("Puzzle")) {
            idToy = 3;
        } else {
            throw new IllegalArgumentException();
        }
        return idToy;
    }

    private static int getToyNameswitch(String id) {
        int idToy;
        switch (id) {
            case "Car":
                idToy = 0;
                break;
            case "Lego":
                idToy = 1;
                break;
            case "Dolli":
                idToy = 2;
                break;
            case "Puzzle":
                idToy = 3;
                break;
            default:
                throw new IllegalArgumentException("Yoi entered an invalid value!");

        }
        return idToy;
    }

    public static void main(String[] args) {
        String id = readDate();
        int idToy1 = getToyNameswitch(id);
        int idToy2 = getToyNameIf(id);
        System.out.println("idToy1:  " + idToy1);
        System.out.println("idToy2:  " + idToy2);
    }

}
