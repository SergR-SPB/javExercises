package my.OOP.Task3_1;

public class RuneMein {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"A",5,100);
        Invoice invoice1 = new Invoice(customer1,11);

        Customer customer2 = new Customer(2,"Af",6,200);
        Invoice invoice2 = new Invoice(customer2,12);

        System.out.println(customer2);
        System.out.println(invoice2);
    }
}
