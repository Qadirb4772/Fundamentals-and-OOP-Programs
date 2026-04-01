class TaxedInvoice extends Invoice{
    private double taxPercent;
    
    //parameterized constructor
    public TaxedInvoice(String invoiceNumber, double baseAmount, double taxPercent){
        super(invoiceNumber, baseAmount);
        if(taxPercent > 0){
          this.taxPercent = taxPercent;
        }else{
            System.out.println("Tax Percentage cannot be negative!!");
        }
    }
    
    @Override
    public double amountDue(){
      return super.getBaseAmount() * (1+taxPercent/100);
    }
}
