package my.OOP.Task3;
/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/

public class Invoice {


    private long totalCost;
    private int idInvoice; // для счета-фактуры и с id покупателя никак не связано
    private Customer customer;
    //double cashVoucher ;

    public Invoice(int idInvoice,Customer customer, long totalCost){

        this.idInvoice = idInvoice;
        this.totalCost = totalCost;
        this.customer =customer;
    }
    public Invoice(){

    }public double bidHriceCustomer() {

        totalCost+=this.customer.getId();
        return totalCost;
    }
    public int id() { return idInvoice; }
    public double getTotalCost() { return totalCost; }
    public void RuneInvoice() {
        Customer[] customers = new Customer[Customer.ligthArrray];
        Invoice []invoices = new Invoice[Customer.ligthArrray];
        //for (int i = 0; i < customers.length; i++) {
            //invoices[i]=new Invoice(customers[i].getId(), totalCost+=customers[i].getCashVoucher());


       // }
    }


}
