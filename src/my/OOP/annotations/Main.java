package my.OOP.annotations;
/*
    Пишем игру Русска рулетка, в которой пользователь загадывает число.
    При совпадении этого числа с рандомно полученным числом в
    заданном программой диапазоне - пользователь убит.
    Вычисление рандомного числа - выносится в аннатацию.



  1. Создаем аннотацию для вычисления рандомного числа "public @interface RandomInt",
  2. Создаем класс процессор для аннотации, котрый обробатывает данные из аннотации
     "RandomIntAnnotationProcessor
  3. Создаем упрвляющий класс, который обрабатывает данные из процессора "RussianRoulette
     и в котором ставится созданная аннотоцияс с границей диопазона вычисления.
  4. Пишем Main в котором создаем обьект класса RussianRoulette
     и передаем ему пользовательский запрос (загаданную цифру)
  */

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        //1. создаем обьект roulette класса RussianRoulette
        RussianRoulette roulette = new RussianRoulette();



        //2. Вызывается метод setField из класса RandomIntAnnotationProcessor
        // с передачей ему объекта roulette
     RandomIntAnnotationProcessor.setField(roulette);


        //3.roulette.getNumber(); Получаем namber из RussianRoulette через обьект roulette
     //System.out.println(roulette.getNumber());
        //4.Вызывается метод gues из обьекта roulette класса RussianRoulette
        // с передачей ему number  = 5
        roulette. guess(5);
    }

}
