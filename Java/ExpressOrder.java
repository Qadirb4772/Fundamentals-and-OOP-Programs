public class ExpressOrder extends Order{
  private final double extraDeliveryFee = 200;
  
  public ExpressOrder(String name, double price) throws IllegalArgumentException{
    super(name, price);
    if(price < 500){
      throw new IllegalArgumentException("Minimum price for express order is 500");
    }
  }
  
  public double getTotal(){
    return super.getPrice() + extraDeliveryFee;
  }
  
  public String getType(){
    return "Express Order";
  }
  
  
}
