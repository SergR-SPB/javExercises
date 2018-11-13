package my.OOP;
/*1. Написать класс, который умеет считать
количество созданных объектов этого класса.*/
public class ObjectMainCount {

    static int count;

        public ObjectMainCount() {
            count++;
        }

    public static void main(String[] args) {

        ObjectMainCount obj1 =new ObjectMainCount();
        ObjectMainCount obj2 =new ObjectMainCount();
        ObjectMainCount obj3 =new ObjectMainCount();
        ObjectMainCount obj4 =new ObjectMainCount();
        ObjectMainCount obj5 =new ObjectMainCount();
        ObjectMainCount obj6 =new ObjectMainCount();

        System.out.println(ObjectMainCount.count);
    }
}
