public class FoodOrder extends Order{
  private int quantity;
  
  FoodOrder(String name, double price, int quantity) throws IllegalArgumentException{
    super(name, price);
    if(quantity < 0){
      throw new IllegalArgumentException("Qty cannot be negative");
    }else{
      this.quantity = quantity;
    }
  }
  
  public double getTotal(){
    return super.getPrice()*this.quantity;
  }
  public String getType(){
    return "F";
  }
}
