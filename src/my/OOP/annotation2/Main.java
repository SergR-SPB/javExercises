package my.OOP.annotation2;
import java.io.IOException;
import java.util.List;
import java.util.logging.LogManager;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, IOException, InstantiationException {

        LogManager.getLogManager().readConfiguration(RandomIntAnnotationProcessor.class.getResourceAsStream("my/OOP"));

        RussianRoulette roulette = new RussianRoulette();
        RandomIntAnnotationProcessor.setField(roulette);
        System.out.println(roulette.getNumber());
        roulette.guess(4);

        List<Object> objects = new PackageClassLoader().getObjects(".annotation2");
        for (Object o : objects){
            System.out.println(o);
        }

    }

}