package my.OOP.Collections_tasks4;
//Динамический массив - список на основе массива.
//Список - набор однотипных элементов


import my.OOP.Collections_tasks.Collections_tasks_4.AbstractDataStructure;

public class DynamicArray extends AbstractDataStructure {

    private int[] array;
    private static final int DEFAULT_CAPACITY = 10; //Дефолтное значение размера
    private double k = 1;
    private int[] otherArray;
    private int[]all;


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

    @Override
    public void addFirst(int value) {
        size++;
        k = 1;
        otherArray = array;
        if (size == array.length) {
            k = 1.5;
        }
        array = new int[(int) (k * array.length)];
        System.arraycopy(otherArray, 0, array, 1, size - 1);
        array[0] = value;
    }

    @Override
    public void addMiddle(int index, int value) {
        size++;
        k = 1;
        otherArray = array;
        if (size == array.length) {
            k = 1.5;
        }
        array = new int[(int) (k * array.length)];
        System.arraycopy(otherArray, 0, array, 0, index);
        System.arraycopy(otherArray, (index), array, (index + 1), size - (index));
        array[index] = value;
    }

    @Override
    public void addLast(int value) {   //Добавление в конец
        if (size == array.length) {
            //место закончилось
            //1. Сохраняем текущий массив
            //2. Создаем новый массив большего размера
            //3. Копируем старый массив в новый
            int[] ollArray = array;
            array = new int[(int) (1.5 * array.length)];
            //через цикл коппируем элементы
            //System.arraycopy(какой массив копируем, с какого места, куда копируем, сколько элементов
            System.arraycopy(ollArray, 0, array, 0, size);
        }
        //Место есть
        // Добавляем элемент в массив и увеличиваем size на единицу:
        //array[size] = value;
        //size = size +1;
        array[size++] = value;
    }
//!!!!!!!!!!!!!!!!
    @Override
    public void addList(int index, int[] all) {

        this.all =all;
        size = size+all.length;

        if (array.length <= size+all.length){
            k=2;
        }

        array = new int[(int)  k*(size+all.length)];
        System.arraycopy(otherArray,0,array,0,index);

        //!!!!!!! // System.arraycopy(all, index,array,index+1,all.length);

    }

    @Override
    public void remove(int index) {
        otherArray =array;
        array = new int[array.length];
        System.arraycopy(otherArray,0,array,0,index);
        System.arraycopy(otherArray,(index+1),array,index,size-(index+1));
        size--;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(6);
        dynamicArray.addLast(7);
        dynamicArray.addLast(8);

        dynamicArray.addFirst(5);
        dynamicArray.addFirst(4);
        dynamicArray.addFirst(3);

        dynamicArray.addLast(9);
        dynamicArray.addLast(10);
        dynamicArray.addLast(11);

        dynamicArray.addFirst(2);
        dynamicArray.addFirst(1);
        dynamicArray.addFirst(0);

        dynamicArray.addMiddle(3, 100);
        dynamicArray.addMiddle(4, 100);
        dynamicArray.addMiddle(5, 100);
        dynamicArray.addLast(12);
        dynamicArray.remove(10);
        dynamicArray.addList(5, new int[]{500,500,500});





        System.out.println();
        System.out.println(dynamicArray.array.length);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.all.length);
       // System.out.println(dynamicArray.lastArray.length);

        for (int i = 0; i < dynamicArray.size; i++) {
            System.out.print(dynamicArray.array[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < dynamicArray.array.length; i++) {
            System.out.print(dynamicArray.array[i]+", ");
        }

    }
}
