package my.OOP.Task5_1;

public class Rectangle extends Shape implements ShapeCollection1{
    double width;
    double height;
    public Rectangle(double width,double height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*(width+height);
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = width*height;
        return square;
    }

    @Override
    public String toString() {
        return String.valueOf("Rectangle Perimeter: " + getPerimeter()+", Rectangle Square: " + getSquare());
    }
}
