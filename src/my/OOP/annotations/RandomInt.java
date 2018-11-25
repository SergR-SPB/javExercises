package my.OOP.annotations;
//Класс со свойствами интерфейса.
//Принимает два значения min и max, последний по дефолтному значению - 100
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*@Target(ElementType.FIELD)
Возвращает массив типов элементов типа аннотации.,
 может быть приложено к типу:........
Аннотацией @Target указывается, какой тип элемента программы будет
использоваться аннотацией. ElementType.FIELD - поля-свойства класса

@Retention(RetentionPolicy.RUNTIME),
дослвно
Возвращает политику хранения.
 @return политика хранения
 RetentionPolicy value();

 RetentionPolicy - Политика хранения аннотаций.  Константы этого перечисляемого типа
 * опишите различные правила хранения аннотаций.  Они используются
 * в сочетании с типом метаданных {@link Retention} для указания
 * как долго должны храниться аннотации.
 * RUNTIME - ВРЕМЯ ВЫПОЛНЕНИЯ  Аннотации должны быть записаны компилятором в файл класса и
 * сохраняются виртуальной машиной во время выполнения, поэтому они могут считываться рефлективно.
 */
@Target(ElementType.FIELD) //анотация ставится над полями
@Retention(RetentionPolicy.RUNTIME) //сохраняется вирт. машиной, может считываться рефлекией
public @interface RandomInt {

    int min();
    int max() default 100;

}
