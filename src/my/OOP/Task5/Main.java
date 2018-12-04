package my.OOP.Task5;
/*5. Написать иерархию классов «Фигуры»: Фигура,
Треугольник, Прямоугольник, Круг. Реализовать ф-ю
подсчета площади для каждого типа фигуры. Создать
список фигур. Вывести площади всех фигур на экран.
Вопрос: как нужно изменить модификаторы доступа.*/
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Shape>list = new ArrayList <>();
        list.add(new Triangle(5,5,5));
        list.add(new Rectangle(5,4,5,4));
        list.add(new Circle(30));

            System.out.println(list );
    }
}
