package my.OOP;

public class ObjectMain {
    public static void main(String[] args) {

        new ObjectTask1();//без этого не работает
        new Task1_OOP();//или этого
        System.out.println(ObjectTask1.count);
        System.out.println(Task1_OOP.count);
    }
}
