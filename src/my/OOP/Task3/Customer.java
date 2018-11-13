package my.OOP.Task3;

/*3. Создать классы Покупатель (Customer) и Счет-фактура (Invoice).
Для каждого покупателя хранить ид, имя и размер скидки;
для счета-фактуры - ид, покупателя и сумарную стоимость*/
public class Customer {

    private   int id;
    private String name;
    private double cashVoucher;
    private double sales;



    public Customer(int id, String name, double cashVoucher, double sales) {
        this.id = id;
        this.name = name;
        this.cashVoucher = cashVoucher;
        this.sales = sales;
    }

    public Customer() {}

    public int getId() {return id;}
    public String getName() {return name; }
    public double getCashVoucher() { return cashVoucher; }
    public double getSales() { return sales; }






















    public static void main(String[] args) {
        Customer[]customers = new Customer[5];
        customers[0] = new Customer(1,"A",100,5);
        customers[1] = new Customer(2,"B",200,10);
        customers[2] = new Customer(3,"C",300,15);
        customers[3] = new Customer(4,"D",400,20);
        customers[4] = new Customer(5,"E",500,25);

        for(int i = 0; i<customers.length; i++){
            System.out.println("Customer-"+customers[i].id+", name: "+customers[i].name+
                   ", cashVoucher: "+ customers[i].cashVoucher +", sales: " +customers[i].sales );
        }}



}
