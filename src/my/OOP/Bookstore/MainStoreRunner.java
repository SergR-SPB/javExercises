
package my.OOP.Bookstore;

public class MainStoreRunner {
    //Перегрузка метода  StoreBooks и печать каталога
    public static void main(String[] args) {
        StoreBooks store = new StoreBooks();
        System.out.println(store);
        /*Book[] books = new Book[9];
    products[0] = new  Book(1,"Ершов","Конек Горбунок",1895,"Россия","Сказка",10);
    books[1] = new Book(2, "Салтыков-Щедрин", "Городовой", 1898, "Россия", "Проза", 9);
    books[2] = new Book(3, "Филатов", "Сказка про Федота стрельца", 1987, "Россия", "Сказка", 10);
    books[3] = new Book(4, "Салтыков-Щедрин", "Городовой-2", 1895, "Россия", "Сказка", 3);
    books[4] = new Book(5, "Пушкин", "Сборник", 1865, "Россия", "Сказка", 1);
    books[5] = new Book(6, "Пушкин", "Сборник-1", 1861, "Россия", "Сказка", 10);
    books[6] = new Book(7, "Пушкин", "Сборник-2", 1862, "Россия", "Сказка", 2);
    books[7] = new Book(8, "Пушкин", "Сборник-3", 1863, "Россия", "Сказка", 3);
    books[8] = new Book(9, "Дюма", "Трое из леса", 1895, "Франция", "Роман", 9);*/

        //Закупк книги магазином
        Book fB1 = new FictionBook("01","hhhhh","mmmmmmmmmmm",1980,"jhjhjh");

        store.addProductToCatalog(fB1);
/*
        FictionBook fB2 = new FictionBook();
        store.addProductToCatalog(fB2);

        FictionBook fB3 = new FictionBook("03");
        store.addProductToCatalog(fB3);*/

        //FictionBook fB4 = new FictionBook("04");
        //store.addProductToCatalog(fB4); // сработало: STOP!!! Where are you taking this?! Books are nowhere to put!!!
        System.out.println(store);
    }

}