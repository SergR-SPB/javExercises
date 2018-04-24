package my.Level1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTesting {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int []arr = {1, 2, 3};
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        int matrix[][] = {{1, 2, 3}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int a = 20;
        foo(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        bar(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void foo(int value) {
        value = 234;
        System.out.println(value);
    }

    static void bar(int [] value) {
        value[0] = 1000;
        value = new int[100];
        System.out.println(Arrays.toString(value));

    }
}
