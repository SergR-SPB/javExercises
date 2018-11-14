package my.OOP.Task1;

/*1. Написать класс, который умеет считать
количество созданных объектов этого класса.*/

public class ObjectMainCount {

    /*верно, но инкапсуляция. иначе кто угодно из любого класса может поменять поле count*/
    private static int count;

    public ObjectMainCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        //про циклы забыли) см ниже
        ObjectMainCount obj1 = new ObjectMainCount();
        ObjectMainCount obj2 = new ObjectMainCount();
        ObjectMainCount obj3 = new ObjectMainCount();
        ObjectMainCount obj4 = new ObjectMainCount();
        ObjectMainCount obj5 = new ObjectMainCount();
        ObjectMainCount obj6 = new ObjectMainCount();

        System.out.println(ObjectMainCount.count);          //из данного класса можно обращаться к count
        System.out.println(ObjectMainCount.getCount());     //из других классов можно обращаться через геттер
    }
}

//для примера как можно было бы переписать Ваш main()
class ObjectMainCountRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new ObjectMainCount();
        }
        System.out.println(ObjectMainCount.getCount());
    }
}
