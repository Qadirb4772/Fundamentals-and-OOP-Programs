interface Measurable{
	double area();
}

class Rectangle implements Measurable{
	private double width;
	private double height;

   //parameterized constructor
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	@Override 
	public double area(){
		return this.width*this.height;
	}

	public double parameter(){
		return 2*(this.width+this.height);
	}
}

public class MeasurableAndRectangle{
	public static void main(String[] args){
		Measurable m = new Rectangle(4.0, 5.0);
		
		System.out.println("Area of the rectangle = "+m.area());
	
	//	System.out.println("Parameter of the rectangle is: "+m.parameter());
		/*	You cannot call this m.parameter() method because the reference is of Interface Measurable and the object is of Rectangle, since the referene tells which methods can be called and object tells that which versions will be called. Hence, the method m.parameter() cannot be called here.*/
	}
}