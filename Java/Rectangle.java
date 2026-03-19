class Rectangle extends Shape{
    private double width;
    private double height;
    
    //parameterized constructor
    Rectangle(String color, double width, double height){
        super(color); //calls parent class's constructor
        this.width  = width;
        this.height  = height;
    }
    
    @Override
    public double getArea(){
      return this.width * this.height;
    }
    
    public double getParameter(){
      return 2*(this.width + this.height);
    }
    
    @Override 
    public void displayInfo(){
      super.displayInfo();
      System.out.println("Width = "+this.width);
      System.out.println("Height = "+this.height);
      System.out.println("Area = "+this.getArea());
      System.out.println("Parameter = "+this.getParameter());
    }
}
