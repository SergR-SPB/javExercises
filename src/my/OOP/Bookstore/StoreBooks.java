package my.OOP.Bookstore;

import java.util.Arrays;

public class StoreBooks {
    private int numberOfBooks = -1;
    public AbstractPrintedEdition[] products = new AbstractPrintedEdition[3];

    /**
     * Вопрос: что мешает или как вставить минимальный набор книг в массив AbstractPrintedEdition[20]
     */
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

    // Проверка перед добавлением товара на МАХ возможное
    //  наличие номенклатуры товаров в магазине (Массиве)

    public void addProductToCatalog(AbstractPrintedEdition product) {
        if (numberOfBooks>=products.length-1){
            throw new IllegalStateException("STOP!!! Where are you taking this?! Books are nowhere to put!!!");
        }
        numberOfBooks++;
        products [numberOfBooks] = product;
    }

    // Проверка перед продажей товара на МIХ возможное
    //  наличие номенклатуры товаров в магазине (Массиве)

    public AbstractPrintedEdition saleProductInCatalog (){
        if (numberOfBooks == -1){
            throw new IllegalStateException("STOP!!! Where you going?! The shop is closed, no books!!!");
        }
        AbstractPrintedEdition product = products[numberOfBooks];
        products[numberOfBooks] = null;
        numberOfBooks--;
        return product;
    }
    // Просмотр имеющейся номенклатуры товаров в магазине (Массиве)
    public void printProducts() {
        System.out.println("Products in the store");
        for (int i = 0; i <= numberOfBooks; i++) {
            System.out.println(i + " " + products[i]);
        }
    }
    // Выбор товара по наибольшей цене
    public AbstractPrintedEdition mostCost() {
        AbstractPrintedEdition result = null;
        for (int i = 0; i <= numberOfBooks; i++) {
            /*if (result == null) {
                result = product;
            } else if (result.getCost() < product.getCost()) {
                result = product;
            }*/
            if (result == null || result.getSalesValue() < products[i].getSalesValue()) {
                result = products[i];
            }
        }
        return result;
    }
    public String toString () {
        return "Store{" +
                "numberOfBooks=" + (numberOfBooks + 1) +
                ", products=" + Arrays.toString(products) +
                '}';

    }


}
