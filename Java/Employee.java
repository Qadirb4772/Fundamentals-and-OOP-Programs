abstract class Employee {
    private String name;
    private String employeeId;
    
    //parameterized constructor
    public Employee(String name, String employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }
    
    //getter for name
    public String getName(){
        return this.name;
    }
    //getter for employeeID
    public String getEmployeeId(){
        return this.employeeId;
    }
    
    //abstract method
    public abstract double monthlyPay();
    
    //method for displaying information
    public void display(){
        System.out.println("Name = "+this.getName());
        System.out.println("Employee ID = "+this.getEmployeeId());
    }
} 
