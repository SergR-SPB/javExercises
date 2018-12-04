package my.OOP.Task1;

/*1. Написать класс, который умеет считать
количество созданных объектов этого класса.*/

public class ObjectMainCount1 {


    /*верно, но инкапсуляция. иначе кто угодно из любого класса может поменять поле count*/
    private static int count;

    public ObjectMainCount1() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        //про циклы забыли) см ниже
        ObjectMainCount1 obj1 = new ObjectMainCount1();
        ObjectMainCount1 obj2 = new ObjectMainCount1();
        ObjectMainCount1 obj3 = new ObjectMainCount1();
        ObjectMainCount1 obj4 = new ObjectMainCount1();
        ObjectMainCount1 obj5 = new ObjectMainCount1();
        ObjectMainCount1 obj6 = new ObjectMainCount1();

        System.out.println(ObjectMainCount1.count);          //из данного класса можно обращаться к count
        System.out.println(ObjectMainCount1.getCount());     //из других классов можно обращаться через геттер
    }
}

//для примера как можно было бы переписать Ваш main()
class ObjectMainCountRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new ObjectMainCount1();
        }
        System.out.println(ObjectMainCount1.getCount());
    }
}
