package my.Level1.Conditions;
import java.sql.SQLOutput;
import java.util.Scanner;
/*Парсинг строки возраста (в строке представлено число типа int).
Можно пользоваться стандартными функциями. Если входная строка является числом,
что не соответствует диапазону 1..120, бросить исключение IllegalArgumentException.
int parseAge(String ageString)*/
public class Task3_AgeParser {
    private static String readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age: ");
        String ageString = scanner.nextLine();
        return ageString;
    }
    private static int parseAge (String ageString){
        int age = Integer.parseInt(ageString);
        if (age>1&&age<120){
        return age;
        } else {
            return 0;
        }
    }
    public static void main (String [] arg) {
        String ageString = readData();
        int age = parseAge (ageString);
        if (age!=0){
            System.out.println("Your age is " + age);
        } else {
            System.out.println("age should be in [1..120]");
        }
    }
}















