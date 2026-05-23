public class SeasonalProduct extends StoreProduct{
  private double discountPercent;
  
  public SeasonalProduct(String name, double basePrice, double discountPercent){
    super(name, basePrice);
    if(discountPercent > 0){
      this.discountPercent = discountPercent;
    }else{
      System.out.println("Discount Percent cannot be negative!!!");
    }
  }
  
  @Override
  public double priceForCustomer(){
    double price = super.priceForCustomer();
    double discount = price * discountPercent/100;
    return price - discount;
  }
  
  public void printTag(){
    System.out.println("Name = "+super.getName());
    System.out.println("Base Price = "+super.getBasePrice());
    System.out.println("Customer Price = "+this.priceForCustomer());
  }
}
