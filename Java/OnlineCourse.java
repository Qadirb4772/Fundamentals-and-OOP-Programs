class OnlineCourse extends Course{
    private double techFeePerCredit;
    
    public OnlineCourse (String courseCode, int creditHours, double techFeePerCredit){
        super(courseCode, creditHours);
        if(techFeePerCredit > 0){
          this.techFeePerCredit = techFeePerCredit;
        }else{
          System.out.println("Invalid Fee for Online Course!! Setting it to Zero....."); 
            this.techFeePerCredit = 0.0;
        }
    }
    
    @Override
    public double totalFee(){
      return super.totalFee()+super.getCreditHours()*this.techFeePerCredit;
    }
}
