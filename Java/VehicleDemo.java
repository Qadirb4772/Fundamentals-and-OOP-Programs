public class VehicleDemo{
	public static void main(String[] args){
		Vehicle vehicles[] = new Vehicle[3];
		vehicles[0] = new Truck("Truck", "XYZ-111", "Ahmed", false);
		vehicles[1] = new Car("Car", "AWS-121", "Ali", true);
		vehicles[2] = new Bike("Motor Cycle", "ASD-1212", "Rahman", false);
		
		for(int i = 0; i < vehicles.length; i++){
		  vehicles[i].display();
		  System.out.println();
		}
	}
}
