package my.OOP.Task5;

public class Triangle  extends Shape {



    protected Triangle(int... lines) {
        super(lines);
    }

    @Override
    protected double calculateSquare() {

        double halfP = calculatePerimeter() / 2;
        return Math.sqrt(halfP * (halfP - lines[0]) * (halfP - lines[1]) * (halfP - lines[2]));
    }

    @Override
    public String toString() {
        return String.valueOf("TriangelSquere: "+ calculateSquare());
    }
}




