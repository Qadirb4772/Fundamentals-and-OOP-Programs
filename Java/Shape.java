class Shape{
    private String color;
    
    //parameterized constructor
    Shape(String color){
        this.color = color;
    }
    
    //getter for color
    public String getColor(){
        return this.color;
    }
    
    //generic method for area
    public double getArea(){
        return 0.0;
    }
    
    //method for display info
    public void displayInfo(){
        System.out.println("Color = " +this.color);
    }
}
