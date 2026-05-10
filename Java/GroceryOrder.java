public class GroceryOrder extends Order{
    private double weight;
    
    public GroceryOrder(String name, double price, double weight) throws IllegalArgumentException{
        super(name, price);
        if(weight <= 0){
          throw new IllegalArgumentException("Weight cannot be less than or equal to 0");
        }else{
          this.weight = weight;
        }
    }
    
    public double getTotal(){
      return super.getPrice()*this.weight;
    }
    
    public String getType(){
      return "Grocery";
    }
}
