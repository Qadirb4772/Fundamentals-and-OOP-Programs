abstract class Invoice{
    private String invoiceNumber;
    private double baseAmount;
    
    //parameterized constructor
    public Invoice(String invoiceNumber, double baseAmount){
        this.invoiceNumber = invoiceNumber;
        if(baseAmount > 0){
            this.baseAmount = baseAmount;
        }else{
            System.out.println("Base Amount Cannot be negative!!!");
        }
    }
    
    //getter for baseAmount
    public double getBaseAmount(){
        return this.baseAmount;
    }
    
    //abstract method
    public abstract double amountDue();
    
    //printing header
    public void printHeader(){
      System.out.println("Invoice Number = "+this.invoiceNumber);
      System.out.println("Base Amount = "+this.baseAmount);
    }
}
