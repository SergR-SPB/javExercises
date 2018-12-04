package my.OOP.Task3_1.Car;

public class CopyCar {
    private int id;
    private String model;
    private double k;
    private double l;

    public CopyCar(OriginalCar originalCar, double k ) {
        this.id = originalCar.getId();
        this.model = originalCar.getModel();
        this.k = k;
        this.l = originalCar.getL()/k;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getK() {
        return k;
    }

    public double getL() {
        return l;
    }

    @Override
    public String toString() {
        return "CopyCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", k=" + k +
                ", l=" + l +
                '}';
    }
}
