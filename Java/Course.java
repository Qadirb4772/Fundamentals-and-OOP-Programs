class Course{
  private String courseCode;
  private int creditHours;
  
  public Course(String courseCode, int creditHours){
    this.courseCode = courseCode;
    if(creditHours > 0 && creditHours < 7){
      this.creditHours = creditHours;
    }else{
      //credit hours are invalid so here we set them as 3
      this.creditHours = 3;
    }
  }
  
  public int getCreditHours(){
    return this.creditHours;
  }
  public void summary(){
    System.out.println("Course Code: "+this.courseCode);
    System.out.println("Credit Hours: "+this.creditHours);
  }
  
  public double totalFee(){
    return this.creditHours * 3000.0;
  }
}
