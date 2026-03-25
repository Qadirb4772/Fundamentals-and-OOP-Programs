class Meal{
  private String mealName;
  private double listPrice;
  
  //parameterized constructor
  Meal(String mealName, double listPrice){
      this.mealName = mealName;
      this.listPrice = listPrice;
  }
  
  public void display(){
    System.out.println("Meal Name = " +this.mealName);
    System.out.println("List Price ="+this.listPrice);    
  }
  
  public double price(){
    return this.listPrice;
  }
  
}
