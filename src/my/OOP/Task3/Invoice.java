package my.OOP.Task3;
/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/

public class Invoice {



    private Customer customer;
    private double totalCost;
    //int id ;
    //double cashVoucher ;

    public Invoice(Customer customer,double totalCost){

        this.customer  = customer;
        this.totalCost = totalCost;
    }
    public Invoice(){

    }public double bidHriceCustomer() {
        Customer customer = new Customer();

        totalCost+=this.customer.getCashVoucher();
        return totalCost;
    }
    public Customer getCustomer() { return customer; }
    public double getTotalCost() { return totalCost; }


}
