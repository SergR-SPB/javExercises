package my.OOP.Task3_1.Car;

public class OriginalCar {
    private int id;
    private String model;
    private  double l;

    public OriginalCar(int id, String model, int l) {
        this.id = id;
        this.model = model;
        this.l = l;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getL() {
        return l;
    }

    @Override
    public String toString() {
        return "OriginalCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", l=" + l +
                '}';
    }
}
