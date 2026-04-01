class Rectangle extends Shape{
    private double width;
    private double length;
    
    //parameterized constructor
    public Rectangle(String color, double width, double length){
        super(color);
        if(width > 0 && length > 0){
            this.width = width;
            this.length = length;
        }else{
            System.out.println("Length And Width cannot be negative");
        }
    }
    
    @Override
    public double getArea(){
      return this.width * this.length;
    }
    
    public double getParameter(){
      return 2*(this.width + this.length);
    }
}   
