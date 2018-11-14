package my.OOP.Task3;
/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/

public class Invoice {
    private int id;                  //это id для счета-фактуры и с id покупателя никак не связано
    private Customer customer;
    private long totalCost;          //деньги храним в целом числе

    public Invoice(int id, Customer customer, long totalCost) {

        this.id = id;
        this.customer = customer;
        this.totalCost = totalCost;
    }

    public double bidHriceCustomer() {

//        totalCost+=this.customer.getId();
        return totalCost;
    }

    public int id() {
        return id;
    }

    public double getTotalCost() {
        return totalCost;
    }

    /*!!!  Не хватает геттеров-сеттеров для полей и переопределенного метода toString() !!!*/

    //стоимость со скидкой
    public long costWithDiscount() {
        return (long) (totalCost * (1 - customer.getDiscount()));
    }

    /*
    что это за метод и как он должен работать не ясно!
    public void RuneInvoice() {
        Customer[] customers = new Customer[Customer.ligthArrray];
        Invoice []invoices = new Invoice[Customer.ligthArrray];
        for (int i = 0; i < customers.length; i++) {
            invoices[i]=new Invoice(customers[i].getId(), totalCost+=customers[i].getCashVoucher());


        }
    }
    */


}
