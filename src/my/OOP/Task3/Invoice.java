package my.OOP.Task3;
/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/

import java.security.PublicKey;

public class Invoice {



    //private Customer customer;
    private double totalCost;
    private int id ;
    private Customer customer;
    //double cashVoucher ;

    public Invoice(int id,double totalCost){

        this.id  = id;
        this.totalCost = totalCost;
    }
    public Invoice(){

    }public double bidHriceCustomer() {

        totalCost+=this.customer.getId();
        return totalCost;
    }
    public int id() { return id; }
    public double getTotalCost() { return totalCost; }
    public void RuneInvoice() {
        Customer[] customers = new Customer[Customer.ligthArrray];
        Invoice []invoices = new Invoice[Customer.ligthArrray];
        for (int i = 0; i < customers.length; i++) {
            invoices[i]=new Invoice(customers[i].getId(), totalCost+=customers[i].getCashVoucher());


            /*System.out.println("Customer-" + customers[i].getId() + ", name: " + customers[i].getName() +
                    ", cashVoucher: " + customers[i].getCashVoucher() + ", sales: " + customers[i].getSales());*/
        }
    }


}
