package my.OOP.Collections_tasks4;
//Динамический массив - список на основе массива.
//Список - набор однотипных элементов


public class DynamicArray extends AbstractDataStructure {

    private int[] array;
    private static final int DEFAULT_CAPACITY = 10; //Дефолтное значение размера
    private double k = 1;
    private int[] otherArray;//Для временного переноса информации из array
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

    //Увеличение размера массива  по необходимости
    private void newLength() {
        if (size == array.length) {
            array = new int[(int) (1.5 * array.length)];
        }
    }
    private void newLength(int[] all) {
        if (array.length <= size+all.length){
            array = new int[(int) 1.5
                    *(size+all.length)];
        }
    }

    @Override
    public void addFirst(int value) {
        size++;
        otherArray = array;
        newLength();

        System.arraycopy(otherArray, 0, array, 1, size - 1);
        array[0] = value;
    }

    @Override
    public void addMiddle(int index, int value) {
        size++;

        otherArray = array;
        newLength();

        System.arraycopy(otherArray, 0, array, 0, index);
        System.arraycopy(otherArray, (index), array, (index + 1), size - (index));
        array[index] = value;
    }



    @Override
    public void addLast(int value) {   //Добавление в конец
        if (size == array.length) {
            int[] ollArray = array;
            array = new int[(int) (1.5 * array.length)];
            System.arraycopy(ollArray, 0, array, 0, size);
        }

        array[size++] = value;
    }

    @Override
    public void addList(int index, int[] all) {

        this.all =all;

        otherArray=array;
        newLength(all);


        System.arraycopy(otherArray,0,array,0,index);
        System.arraycopy(all,0,array,index,all.length);
        System.arraycopy(otherArray,index,array,index+all.length,size-index);
        size = size+all.length;

        //System.arraycopy(all, index,array,index,all.length);
    }

    @Override
    public void remove(int index) {
        otherArray =array;
        array = new int[array.length];
        System.arraycopy(otherArray,0,array,0,5);
        System.arraycopy(otherArray,6,array,index,size-(index+1));
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


//        dynamicArray.addMiddle(3, 100);
//        dynamicArray.addMiddle(4, 100);
//        dynamicArray.addMiddle(5, 100);
//        dynamicArray.addLast(12);
        //dynamicArray.remove(10);
        dynamicArray.addList(5, new int[]{500,500,500});
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
