public class StoreProduct{
  private String name;
  private double basePrice;
  
  public StoreProduct(String name, double basePrice){
    this.name = name;
    if(basePrice > 0){
      this.basePrice = basePrice;
    }else{
      System.out.println("Base Price cannot be negative!!!");
    }
  }
  
  public String getName(){
    return this.name;
  }
  
  public double getBasePrice(){
    return this.basePrice;
  }
  
  public double priceForCustomer(){
    return this.getBasePrice();
  }
}
