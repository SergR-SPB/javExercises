package my.OOP.Task3_1;

class SupАccounting {
    protected int idInvoice;
    protected int idCustomer;
    protected String name;
    protected double discount;
    protected long cashVoucher;
    protected long totalCost;

    public int getIdInvoice() { return idInvoice; }
    public int getIdCustomer() { return idCustomer; }
    public String getName() { return name; }
    public double getDiscount() { return discount; }
    public long getCashVoucher() { return cashVoucher; }
    public long getTotalCost() { return totalCost; }


    //Конструктор для класса Customer
    public SupАccounting(int idCustomer, String name, double discount, long cashVoucher){
              this.idCustomer = idCustomer;
              this.name = name;
              this.discount = discount;
              this.cashVoucher = cashVoucher;
    }
    //Конструктор для класса Invice
    public SupАccounting(int idInvoice, int getIdCustomer, String name, long totalCost) {
        this.idInvoice = idInvoice;
        this.idCustomer = getIdCustomer();//Нужно чтобы брал  id Customer
        this.name = getName();//Нужно чтобы брал  name Customer
        this.totalCost += getCashVoucher();//нужно чтобы сразу преобразовывал
    }
//    public long CalculateTotalCost(int cashVoucher){
//        totalCost+=cashVoucher;
//        return totalCost;
//    }



}
