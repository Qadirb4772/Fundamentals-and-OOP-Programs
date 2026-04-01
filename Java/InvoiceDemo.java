public class InvoiceDemo{
      public static void main(String[] args){
          TaxedInvoice inv = new TaxedInvoice("INV-01", 1000, 15);
          inv.printHeader();
          System.out.println("Amount Due = "+inv.amountDue());
      }
}
