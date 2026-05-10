public abstract class Order implements Orderable{
  private String name;
  private double price;
  
  Order(String name, double price) throws IllegalArgumentException{
      this.name = name;
      if(price < 0){
        throw new IllegalArgumentException("Price cannot be negative");
      }else{
        this.price = price;
      }
  }
  
  public double getPrice(){
    return this.price;
  }
  
  
}
