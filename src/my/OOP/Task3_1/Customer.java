package my.OOP.Task3_1;

public class Customer  {

    private int idInvoice;
    private int idCustomer;
    private String name;
    private double discount;
    private long cashVoucher;
    private long totalCost;

    public int getIdInvoice() { return idInvoice; }
    public int getIdCustomer() { return idCustomer; }
    public String getName() { return name; }
    public double getDiscount() { return discount; }
    public long getCashVoucher() { return cashVoucher; }
    public long getTotalCost() { return totalCost; }


    public Customer(int idCustomer, String name, double discount, long cashVoucher) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.discount=discount;
        this.cashVoucher=cashVoucher;
    }

    @Override
    public String toString() {
        return "Customer {"+"id: "+idCustomer+", name: "+ name+", discount: "+discount
                +", cashVoucher: "+cashVoucher+"}";
    }
}
