package my.Level1.Loops;

import java.util.Scanner;

/*Вывод на экран целых чисел от first до last c шагом step.
Если вывод может привести к зацикливанию, бросить исключение
IllegalArgumentException.
void printRange(int first, int last, int step)
Входные аргументы   int first, int last, int step
Тип результата      Вывод на экран
Пример
Входные аргументы	Результат
1, 8,  2	        1 3 5 7
8, 1, -2	        8 6 4 2
1, 8, -2	        IllegalArgumentException
*/
public class W2_Task2_RangeWithStepPrinter {
    private  static int enterArgument (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input argument: ");
        return scanner.nextInt();
    }
    private static void printRange(int first, int last, int step){
        if (first<last&&step>0){
            for (int a=first; a<=last; a=a+step){
                System.out.print(+a+" ");
            }
        }else if (first>last&&step<0){
            for (int a =first; a>=last; a=a+step){
                System.out.print(+a+" ");
            }
        }else{
            throw new IllegalArgumentException("Error");
        }
    }

    public static void main(String[] args) {
        int first = enterArgument();
        int last = enterArgument();
        int step = enterArgument();
        printRange(first,last,step);
    }

}
