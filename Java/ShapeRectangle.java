class ShapeRectangle{
    public static void main(String[] args){
      Rectangle rec = new Rectangle("Blue", 3.0, 5.0);
      rec.displayInfo();
      System.out.println("\n\tPrinting separately\n");
      System.out.println("Area = "+rec.getArea());
      System.out.println("Parameter = "+rec.getParameter());
    }
}
