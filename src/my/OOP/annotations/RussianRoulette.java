package my.OOP.annotations;

public class RussianRoulette {

    @RandomInt(min = 3, max = 5)
    private int number;
    private double withoutAnnotation; // для проверки работы исключения
    @RandomInt(min = 3, max = 5)      // для проверки работы исключения
    long q;

    public void guess(int number) {
        System.out.println(
                "number (загаданное число из класса Main ) = "+number);
        System.out.println(
                "this.number (полученное число через аннотацию из = "+this.number);
        if (number == this.number) {
            System.out.println("You are died...");
        }else {
            System.out.println("It's amazing you're still alive.... bye");
        }
    }
}
