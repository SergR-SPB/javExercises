package my.OOP.Task5;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[3];
        shapes[0] = new Triangle(5,5,5);
        shapes[1] = new Rectangle(6,5,6,5);
        shapes[2] = new Circle(70);
        print(shapes);
    }

    private static void print(Shape []shapes) {
        System.out.println(shapes[0].calculateSquare());
        System.out.println(shapes[1].calculateSquare());
        System.out.println(shapes[2].calculateSquare());
    }
}
