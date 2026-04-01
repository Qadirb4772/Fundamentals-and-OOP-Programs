class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;
    
    //parameterized constructor
    public HourlyEmployee(String name, String employeeId, double hoursWorked, double hourlyRate){
        super(name, employeeId);
        if(hoursWorked > 0 && hourlyRate > 0){
              this.hoursWorked = hoursWorked;
              this.hourlyRate  = hourlyRate;
        }else{
            System.out.println("HoursWorked and Rate must be positive");
        }
    }
    
    @Override 
    public double monthlyPay(){
        return this.hoursWorked * hourlyRate;
    }
    
    
}
