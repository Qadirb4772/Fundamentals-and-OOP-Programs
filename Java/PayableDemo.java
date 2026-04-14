interface Payable{
	double amountDue();
}

class HourlyService implements Payable{
	private double hours;
	private double ratePerHour;

	HourlyService(double hours, double ratePerHour){
		this.hours = hours;
		this.ratePerHour = ratePerHour;
	}

	@Override
	public double amountDue(){
		return this.hours*this.ratePerHour;
	}
}

public class PayableDemo{
	public static void main(String[] args){
		Payable p = new HourlyService(10, 50);
		System.out.println("Hourly Pay = "+p.amountDue());
	}
}