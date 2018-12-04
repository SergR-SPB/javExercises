package my.OOP.Task3_1.Car;

public class App { public static void main(String[] args)  {
    OriginalCar originalCar  = new OriginalCar(1,"Mazda",125);
    CopyCar copyCar = new CopyCar(originalCar,2);

    OriginalCar originalCar1 = new OriginalCar(2,"reno",140);
    CopyCar copyCar1 = new CopyCar(originalCar1,4);

    System.out.println(originalCar);
    System.out.println(copyCar);
    System.out.println(originalCar1);
    System.out.println(copyCar1);

}

}
