package my.OOP.Bookstore;

public abstract class AbstractPrintedEdition { //abstract class AbstractPrintedEdition



    protected String id;
    private int purchaseValue;//Закупочная стоимость Стоимость продажи
    protected int salesValue;   //Стоимость продажи
    private int tradingMargin ; // Торговая маржа

    public String getId() {
        return id;
    }

   // public void setId(String id) {
    //    this.id = id;
    //}

    public int getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(int purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    private int getTradingMargin() {
        tradingMargin=salesValue-purchaseValue;
        return tradingMargin; }

    public int getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(int salesValue) {
        this.salesValue = salesValue;
    }
}
