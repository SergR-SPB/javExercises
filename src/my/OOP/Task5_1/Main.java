package my.OOP.Task5_1;
/*5. Написать иерархию классов «Фигуры»: Фигура,
Треугольник, Прямоугольник, Круг. Реализовать ф-ю
подсчета площади для каждого типа фигуры. Создать
список фигур. Вывести площади всех фигур на экран.
Вопрос: как нужно изменить модификаторы доступа.*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       ArrayList<ShapeCollection1>list=new ArrayList <>();
       list.add(new Rectangle(5,5));
       list.add(new Rectangle(4,7));
       list.add(new Rectangle(3,2));
        System.out.println(list );
    }
}
