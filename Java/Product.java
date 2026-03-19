class Product{
    private String name;
    private double price;
    
    //parameterized constructor
    Product(String name, double price){
        this.name = name;
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Price cannot be negative!!");
            this.price = 0.0;
        }
    }
    //getter for price 
    public double getPrice(){
      return this.price;
    }
    //getter for name
    public String getName(){
      return this.name;
    }
    
    //method for printing product info
    public void displayInfo(){
      System.out.println("Name= "+this.name+"\nPrice = "+this.price);
    }
}
