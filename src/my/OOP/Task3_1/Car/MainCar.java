package my.OOP.Task3_1.Car;

public class MainCar {
    private int id;
    private String model;
    private double k;
    private double l;




    public MainCar(int id, String model, int l) {
        this.id = id;
        this.model = model;
        this.l = l;
    }

    public MainCar(MainCar car, double k ) {
        this.id = car.getId();
        this.model = car.getModel();
        this.k = k;
        this.l = car.getL()/k;
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
        return "OriginalCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", l=" + l +
                '}';





               /* "CopyCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", k=" + k +
                ", l=" + l +
                '}'+"\n"+"\n"+"OriginalCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", l=" + l +
                '}'*/

    }

    public static void main(String[] args) {
        MainCar  car = new MainCar(1,"Mazda",125);
        MainCar copy = new MainCar(car,2);

        MainCar car1 = new MainCar(2,"reno",140);
        MainCar copy1 = new MainCar(car1,4);

        System.out.println(car1);
        System.out.println(copy1);
        System.out.println("-----------------------");
        System.out.println(car);
        System.out.println(copy);
    }
}
