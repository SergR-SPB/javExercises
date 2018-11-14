package my.OOP.Task3;
/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/

import java.security.PublicKey;

public class Invoice {



    //private Customer customer;
     double totalCost;
     int id ;
     Customer customer;
    //double cashVoucher ;

    public Invoice(double totalCost){

        this.id  = id;
        this.totalCost = totalCost;
    }
    public Invoice(int id, double cashVoucher){

    }public double bidHriceCustomer() {

        totalCost+=this.customer.getId();
        return totalCost;
    }
    public int getId() { return id; }
    public double getTotalCost() { return totalCost; }
    /*public void RuneInvoice() {
        Customer[] customers = new Customer[Customer.ligthArrray];
        Invoice []invoices = new Invoice[Customer.ligthArrray];
        for (int i = 0; i < customers.length; i++) {
            invoices[i]=new Invoice(customers[i].getId(), totalCost+=customers[i].getCashVoucher());


        }
    }*/


}
