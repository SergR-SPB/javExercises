package my.OOP.Task3_1;

public class Invoice {
    private int idInvoice;
    private int idCustomer;
    private String name;
    private double discount;
    //private long cashVoucher;
    private long totalCost;
    static long totalSumm;

    public int getIdInvoice() { return idInvoice; }
    //public int getIdCustomer() { return idCustomer; }
   // public String getName() { return name; }
    //public double getDiscount() { return discount; }
    //public long getCashVoucher() { return cashVoucher; }
    public long getTotalCost() { return totalCost; }

    public Invoice(Customer customer,   int idInvoice) {

        this.idInvoice = idInvoice;
        this.idCustomer = customer.getIdCustomer();
        this.name = customer.getName();
        this.totalCost=totalSumm+customer.getCashVoucher();
        totalSumm=this.totalCost;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id: "+idInvoice+", idCustomer:"+idCustomer+", name: "+name
                +", totalCost: " +totalCost +"}";
    }
}
