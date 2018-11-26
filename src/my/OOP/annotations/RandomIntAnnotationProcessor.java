package my.OOP.annotations;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomIntAnnotationProcessor {

    public static void setField(Object object)
            throws IllegalAccessException, AnnotationInvalidFieldTypeException {
        // 1. Получаем объекта класса Class
        // 2. Находим все его поля
        // 3. Находим аннтоции RandomInt
        // 4. Устанавливаем значение

        //Class<?> getClass() - получает класс объекта во время выполнения
        Class <?> objectClass = object.getClass();
        // Находим все поля полученного класса
        Field[] fields = objectClass.getDeclaredFields();

        //Прогоняем полученный массив полей на наличие аннотации RandomInt
        for (Field field : fields) {
//Дополнительно
            //field.getName() - Возвращает имя поля, представленного этим объектом
            System.out.println("Field - имя поля: " + field.getName());
            //field.getType() - возвращает тип поля объекта, идентифицирующий объявленный.
            //(тип поля, представленного данным объектом
            System.out.println("Field type-тип поля: " + field.getType());
            // Если поле не имеет аннотации - то annotation = null
//--------------
            RandomInt annotation = field.getAnnotation(RandomInt.class);
            System.out.println("Is null=: " + (annotation == null) + "\n*********");
            //Если аннотация NonNull вычисляем рандомное число


            if (annotation != null) {
                if (field.getType() != int.class && field.getType() != Integer.class) throw new AnnotationInvalidFieldTypeException
                        ("AnnotationInvalidFieldTypeException:\nthe annotation is not above the int or Integer type\n"+field.getType()+"\n");


                int number = new Random().nextInt(annotation.max() - annotation.min() + 1) + annotation.min();
                System.out.println("Number: " + number);

                field.setAccessible(true);//получаем доступ к статическому private полю
                field.set(object, number); // вносим изменение в это поле
            }

        }

    }


    protected static class AnnotationInvalidFieldTypeException extends Exception {
        public  AnnotationInvalidFieldTypeException(String message) {

            super(message);
        }

    }
}

