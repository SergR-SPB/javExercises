package my.OOP.Collections_tasks.Lesson;

public class Element {

    private int value; // значение
    private Element next; // ссылка на следующий элемент списка

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
