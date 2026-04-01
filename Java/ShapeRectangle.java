class ShapeRectangle{
    public static void main(String[] args){
        //Shape myShape  = new Shape("White"); //this will cause error
        Rectangle r = new Rectangle("Red", 4.0, 5.0);
        r.display();
        System.out.println();
        System.out.println("Area of the rectangle is: "+ r.getArea());
        System.out.println("Parameter of the rectangle is: "+r.getParameter());
    }
}
