package my.Level1.Conditions;

import java.util.Scanner;

/*Парсинг строки возраста (в строке представлено число типа int).
 Можно пользоваться стандартными функциями.
 Если входная строка является числом, что не соответствует диапазону 1..120,
 бросить исключение IllegalArgumentException.
int parseAge(String ageString)
Входные аргументы	Тип результата
String ageString	int
Пример
Входные аргументы	Результат
“25”	25
“0”	IllegalArgumentException
*/
public class W3_Task3_AgeParser {
    //Обьявления метода readDate: ввода данных
    //-На выходе String переменная,
    //-На входе ().
    private static String readDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inpu age: ");
        String ageString = scanner.nextLine();
        return ageString;
    }

    //Обьявления метода parseAge: перевода строковых данных в число
    //-На выходе int переменная age
    //-На входе (String ageString).
    private static int parseAge(String ageString) {
        int age = Integer.parseInt(ageString);
        if (age < 1 && age > 120) {
            return 0;
        } else {
            return age;
        }
    }

    public static void main(String[] args) {
        String ageString = readDate();
        int age = parseAge(ageString);
        if (age != 0) {
            System.out.println("Your age is:  "+age);
        }else {
            System.out.println("Thi is not age:  " );
        }
    }
}
