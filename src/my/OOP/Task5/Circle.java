package my.OOP.Task5;

public class Circle extends Shape {
    public Circle(int... lines) {
        super(lines);
    }

    @Override
    protected double calculateSquare() {
        double pi = 3.14159265;

        //return (lines[0]*lines[0])/(4*pi);
        return (calculatePerimeter()*calculatePerimeter())/(4*pi);
    }
}
