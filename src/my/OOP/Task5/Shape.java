package my.OOP.Task5;
/*5. Написать иерархию классов «Фигуры»: Фигура,
Треугольник, Прямоугольник, Круг. Реализовать ф-ю
подсчета площади для каждого типа фигуры. Создать
список фигур. Вывести площади всех фигур на экран.
Вопрос: как нужно изменить модификаторы доступа.*/

public class Shape {
    //Поле класса общее для всех дальнейших вычислений
    public int[]lines;

    /*public int[] getLines() { return lines; }
    public void setLines(int... lines) { this.lines = lines; }*/

    //Конструктор класса принимающий массив
    protected Shape(int... lines) {
        this.lines = lines;
    }
    //Методы класса (вычисление площади и периметра фигуры
    protected   double calculateSquare(){
        return 0;
    }
    public double calculatePerimeter(){
        double perimeter=0.0;
        for (int i = 0; i<lines.length; i++){
            perimeter += lines[i];
        }
        return  perimeter;
    }
}
