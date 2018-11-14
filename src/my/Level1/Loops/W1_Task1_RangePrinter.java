package my.Level1.Loops;

import java.util.Scanner;

/*Вывод на экран целых чисел от first до last.
void printRange(int first, int last)
Входные аргументы	int first, int last
Тип результата      Вывод на экран
Пример
Входные аргументы	Результат
1, 5	             1 2 3 4 5
5, 1	             5 4 3 2 1
1, 1	             1
*/
public class W1_Task1_RangePrinter {
    private static int enterArgument (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument:  ");
        return scanner.nextInt();
    }
    private  static void printRange(int first, int last){
        if (first<last){
            for (int a=first; a<=last;a++){
             System.out.print(+a+", ");
            }
        }else {
            for (int a = first; a>=last; a--){
                System.out.print(+a+" ");
            }
        }
    }

    public static void main(String[] args) {
        int first = enterArgument ();
        int last = enterArgument ();
        printRange(first,last);
    }
}
