class LabCourse extends Course{
    private double labFee;
    
    public LabCourse(String courseCode, int creditHours, double labFee){
        super(courseCode, creditHours);
        this.labFee = labFee;
    }
    
    @Override
    public double totalFee(){
      return super.totalFee()+this.labFee;
    }
    
}
