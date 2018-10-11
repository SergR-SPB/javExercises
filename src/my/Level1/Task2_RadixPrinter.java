

/*Task 2** (RadixPrinter)
Вывод в консоль неотрицательного целого числа в системе счисления radix (2..10). Если число отрицательное или система счисления не соответствует диапазону, бросить исключение IllegalArgumentException.
Использование библиотечных методов запрещено.
void printInRadix(int n, int radix)
Входные аргументы |	Тип результата
------------------|------------------
int n, int radix  |	Вывод на экран
Входные аргументы |	Результат
147292, 2	      |100011111101011100
147292, 8         |	437534
147292, 10        |	147292
-147292, 10       |	IllegalArgumentException
147292, -10	      |IllegalArgumentException
--------------------------------------------
44_10 переведём в двоичную систему:
44 делим на 2. частное 22, остаток 0
22 делим на 2. частное 11, остаток 0
11 делим на 2. частное  5, остаток 1
 5 делим на 2. частное  2, остаток 1
 2 делим на 2. частное  1, остаток 0
 1 делим на 2. частное  0, остаток 1
Частное равно нулю, деление закончено.
Теперь записав все остатки снизу вверх
получим число 101100_2
*/

import java.util.Arrays;

public class Task2_RadixPrinter {
    public static void main(String[] args) {
        int n = 44;    //заданое число
        int radix = 2;    //база системы счисления
        int remainder;     // остаток от деления числа на базу
        int numberSize =0; //Число знаков в искомом числе
        int zeroMultiplier = 1;//Степень 10
        int radixSize=0;     // Искомое чсло
        for (int i = n; i >0; i=i/radix){
             remainder = i%radix;
             numberSize++;
            System.out.println("ostatok: "+ remainder+",  sp= "+ numberSize);
        }
        System.out.println("--------------------");

        for (int i = n, j = numberSize-1, q=1 ; i >0&& j>=0 && q<numberSize; i=i/radix, j--,q++){
            remainder = i%radix;
            radixSize = (radixSize+remainder)*zeroMultiplier;
            zeroMultiplier=zeroMultiplier*10;
            /*

            //d =spI;

            ridBox [j] = remainder;
            System.out.println("D: "+j+",ridBox [d] = "+ridBox [j]); */

        }
        System.out.println("-------------------------");
        System.out.print(radixSize);


    }

}
