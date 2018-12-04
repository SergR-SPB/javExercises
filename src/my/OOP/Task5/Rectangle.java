package my.OOP.Task5;

public class Rectangle extends Shape {
    public Rectangle(int... lines) {
        super(lines);
    }

    @Override
    protected double calculateSquare() {
        return lines[0]*lines[1];
    }
    @Override
    public String toString() {
        return String.valueOf(" RectangleSquare: "+calculateSquare());
    }

}
