package my.OOP.Task3;

public class RunMain {

    public static void main(String[] args) {
        int x =5;
        Customer[]customers = new Customer[x];
        customers[0] = new Customer(1,"A",100,5);
        customers[1] = new Customer(2,"B",200,10);
        customers[2] = new Customer(3,"C",300,15);
        customers[3] = new Customer(4,"D",400,20);
        customers[4] = new Customer(5,"E",500,25);

        Invoice[]invoices = new Invoice[x];
        invoices[0] = new Invoice(customers[0],2);
        invoices[1] = new Invoice(customers[1],2);
        invoices[2] = new Invoice(customers[2],2);
        invoices[3] = new Invoice(customers[3],2);
        invoices[4] = new Invoice(customers[4],2);

        for(int i = 0; i<customers.length; i++){
            System.out.println("Customer-"+customers[i].getId()+", name: "+customers[i].getName()+
                    ", cashVoucher: "+ customers[i].getCashVoucher() +", sales: " +customers[i].getSales() );
        }
        for(int i = 0; i<invoices.length; i++){
            System.out.println("Customer-"+invoices[i].getCustomer()+
                    ", totalCost: "+ invoices[i].getTotalCost() );
        }

    }
}
