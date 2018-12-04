package my.OOP.Collections_tasks4;
//Динамический массив - список на основе массива.
//Список - набор однотипных элементов


public class DynamicArray extends AbstractDataStructure {

    private int[] array;  //массив должен быть один. временное оно на то и временное, чтобы использовать его в методе и после GC удалил его
    private static final int DEFAULT_CAPACITY = 10; //Дефолтное значение размера
    private double k = 1;


    //Массив для наших элементов
    //Задаем два конструктора-пустой и с параметрами

    public DynamicArray() {
        //this.array = new int [DEFAULT_CAPACITY]; - повторение кода,
        //нужно вызвать конструктор DynamicArray(int) в конструкторе=>
        this(DEFAULT_CAPACITY);
    }

    //capacity - первональный размер массива
    public DynamicArray(int capacity) {
        this.array = new int[capacity]; //инициализация массива

    }

    //Увеличение размера массива  по необходимости
    private void newLength() {
        if (size == array.length) {
            //увеличение в 1.5 раз - плохая идея.
            // Если начальный размер (capacity) пользователь задаст =1, то никакого увеличения никогда не будет
            // (int) (1.5 * array.length) всегда будет равно 1
            int[] tmp = new int[2 * array.length];
//            array = new int[(int) (1.5 * array.length + 1)];  //или же хотябы 1 добавлять - это если на 1.5 хочется множить
            System.arraycopy(array, 0, tmp, 0, array.length);//копируем элементы из старого в новый массив
            array = tmp;
        }
    }

    //название переменной all вообще ничего не говорит
    private void newLength(int[] addedElements) {
        if (array.length <= size + addedElements.length) {
            int[] tmp = new int[2 * size + addedElements.length]; //можно так, например сделать
            System.arraycopy(array, 0, tmp, 0, array.length); //копируем элементы из старого в новый массив
            array = tmp;
        }
    }

    @Override
    public void addFirst(int value) {
        newLength();
        if (size > 0) {
            System.arraycopy(array, 0, array, 1, size);
        }
        array[0] = value;
        size++;
    }

    @Override
    public void addMiddle(int index, int value) {
        verifyIndex(index);

        newLength();

        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }


    @Override
    public void addLast(int value) {   //Добавление в конец
        newLength();
        array[size++] = value;
    }

    @Override
    public void addList(int index, int[] all) {
        verifyIndex(index);
        if (all == null || all.length == 0) { //если ничего не добавляем, то выйти из процедуры - или же можно исключение бросать
            return;
        }
        newLength(all);


        System.arraycopy(array, index, array, index + all.length, size - index); //смещаем элементы начиная с позиции index
        // на all.length элементов вправо

        System.arraycopy(all, 0, array, index, all.length); //копируем элементы из all в массив, начиная с позиции index
        size += all.length;  //сокращенная ж запись есть +=
    }

    private void verifyIndex(int index) {
        if (index < 0 || index >= size) { //проверка, что индекс в допустимом диазазоне
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void remove(int index) {
        verifyIndex(index);

        System.arraycopy(array, index + 1, array, index, array.length - index - 1); //с индекса (index + 1) сдвинуть на позицию влево, т.е. вставить в
        // позицию index
        size--;
    }

    //переопределяем метод для вывода
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("DynamicArray{")
                .append("array={");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("}; size=").append(size)
                .append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        //есть же циклы! Зачем писать 100 строк для добавления 100 элементов?
        //и в прошлый раз Вы так же создавали кучу эелементов, а я давал пример как можно сделать в циклах
        for (int i = 0; i < 11; i++) {
            dynamicArray.addLast(i);
        }
        System.out.println(dynamicArray);

        for (int i = 5; i > 1; i--) {
            dynamicArray.addFirst(i);
        }
        System.out.println(dynamicArray);

        dynamicArray.addList(2, new int[]{777, 878, 987});
        System.out.println(dynamicArray);

        for (int i = 3; i < 10; i += 2) {
            dynamicArray.addMiddle(i, i * 11);
        }
        System.out.println(dynamicArray);

        dynamicArray.addLast(-1);
        System.out.println(dynamicArray);

        dynamicArray.remove(10);
        dynamicArray.remove(21);
        System.out.println(dynamicArray);
    }
}
