public abstract class Shape{
    private String color;
    
    //parameterized constructor
    public Shape(String color){
        this.color = color;
    }
    
    //getter for color
    public String getColor(){
        return this.color;
    }
    
    //abstract getArea()
    public abstract double getArea();
    
    public void display(){
      System.out.println("Color = "+ this.getColor());
      System.out.println("Area = "+this.getArea());
    }
}
