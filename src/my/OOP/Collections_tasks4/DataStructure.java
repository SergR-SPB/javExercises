package my.OOP.Collections_tasks4;
/*4. Написать свою реализацию классов

ArrayList и LinkedList для типа Integer.*/

//Интерфейс в котором определяем необходимые поля и методы
//для классов ArrayList и LinkedList---

public interface DataStructure {

    //   Колл-во элементов в структуре List

    int size ();



    //Добавление в начало
    void addFirst(int  value);

    //Вобавление в середину
    void addMiddle (int index,int value );

    //Добавление в конец
    void addLast (int value);

    //Добавление другого массива
    void addList(int index, int[]all);

    //Удаление по индксу
    void remove (int index);

    //Проверка наличия элементов в List
    boolean isEmpty();


}
