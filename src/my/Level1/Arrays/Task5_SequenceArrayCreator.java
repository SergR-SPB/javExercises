package my.Level1.Arrays;
/*Написать метод создания массива размера size, заполненного значениями от 0..(size-1). Если size < 0, бросить исключение IllegalArgumentException.
int[] createSequenceArray(int size)

Пример работы:
createSequenceArray(5) => {0, 1, 2, 3, 4}
createSequenceArray(-1) -> IllegalArgumentException*/

import java.util.Arrays;

public class Task5_SequenceArrayCreator {

    public static void main(String[] args) {
        int size = Task4_ArrayPositivesCounter.arraySize();
        int[] createSequenceArray = createSequenceArray(size);
        //System.out.println(Arrays.toString(createSequenceArray));

    }
    //Вброс исключения при size<0
    public static int[] createSequenceArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("You entered an invalid value++");
        }
        int[] createSequenceArray = Task4_ArrayPositivesCounter.arrayChoice(size);
        return createSequenceArray;
    }
}
//-------------------------------
/*Input array size: 0
Exception in thread "main" java.lang.IllegalArgumentException: You entered an invalid value++
	at my.Level1.Arrays.Task5_SequenceArrayCreator.createSequenceArray(Task5_SequenceArrayCreator.java:22)
	at my.Level1.Arrays.Task5_SequenceArrayCreator.main(Task5_SequenceArrayCreator.java:15)

Process finished with exit code 1*/
/*Input array size: 3
Choice of array filling method:
If "1" - console filling,
If "2" - random filling:
1
Input array[0] = 2
Input array[1] = 3
Input array[2] = 4
[2, 3, 4]

Process finished with exit code 0*/