package my.OOP.Task3;
/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/

public class Invoice {
    Customer customer = new Customer(15,"gh",5,5);
    double totalCost;
    int id = customer.getId();
    double cashVoucher =customer.getCashVoucher();

    public double bidHriceCustomer(double cashVoucher) {

        totalCost+=cashVoucher;
        return totalCost;
    }
    public Invoice(int id,double totalCost){
        this.id = id;
        this.totalCost = bidHriceCustomer(cashVoucher);
    }

}
