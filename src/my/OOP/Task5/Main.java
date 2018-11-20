package my.OOP.Task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     /*   Shape[]shapes = new Shape[3];
        shapes[0] = new Triangle(5,5,5);
        shapes[1] = new Rectangle(6,5,6,5);
        shapes[2] = new Circle(70);
        print(shapes);
    }

    private static void print(Shape []shapes) {
        System.out.println(shapes[0].calculateSquare());
        System.out.println(shapes[1].calculateSquare());
        System.out.println(shapes[2].calculateSquare());}*/
        Shape <>list = new ArrayList <>();
        list.add(0,new Triangle(5,5,5));
        list.add(new Rectangle(5,4,5,4));
        list.add(new Circle(30));
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }

}
