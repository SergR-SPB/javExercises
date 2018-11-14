package my.OOP.Task3;

public class RunMain {



    public static void main(String[] args) {
        int ligthArrray;

//Customer [] customers;

        Customer[]customers = new Customer[5];
        Invoice []invoices = new Invoice[5];
        customers[0] = new Customer(1,"A",100,5);
        customers[1] = new Customer(2,"B",200,10);
        customers[2] = new Customer(3,"C",300,15);
        customers[3] = new Customer(4,"D",400,20);
        customers[4] = new Customer(5,"E",500,25);
        ligthArrray = customers.length;


        for (int i = 0; i < invoices.length; i++) {
            invoices[i]=new Invoice(customers[i].getId(),
                    customers[i].getCashVoucher());

        }
        calculateAndPrintSquare (invoices);
    }
        static void calculateAndPrintSquare (Invoice []invoices) {
            for (int i = 0; i < invoices.length; i++) {

                System.out.println(invoices[i].getClass().getName() + " : "
                        + invoices[i].getId()+ " : "
                        + invoices[i].getTotalCost());
            }

    }

}
