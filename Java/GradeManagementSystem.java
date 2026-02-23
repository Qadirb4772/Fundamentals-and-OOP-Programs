class GradeManager{
    private String studentName;
    private String studentId;
    private double[][] subjectGrades;
    private String[] subjectNames;
    
    //PARAMETERIZED CONSTRUCTOR
    GradeManager(String studentName, String studentId, String[] subjectNames){
      this.studentName = studentName;
      this.studentId = studentId;
      this.subjectNames = new String[subjectNames.length];
      this.subjectGrades = new double[subjectNames.length][subjectNames.length];
      for(int i = 0; i < subjectNames.length; i++){
        this.subjectNames[i] = subjectNames[i];
      }
      
    } 
    //METHOD FOR ADDING GRADE INTO GRADE ARRAY
    public void addGrade(String subjectName, double grade){
    if(grade >= 0 && grade <= 100){
      int subjectIndex = -1;
      boolean subjectFound = false;
      for(int i = 0; i < this.subjectNames.length; i++){
        if(subjectNames[i].equalsIgnoreCase(subjectName)){
          subjectIndex = i;
          subjectFound = true;
          break;
        }
      }
      if(!subjectFound){
        System.out.println(subjectName +" Not Found!!!!");
        return;
      }
      
        for(int g = 0; g < subjectGrades[subjectIndex].length; g++){
          if(subjectGrades[subjectIndex][g] == 0.0){
            subjectGrades[subjectIndex][g] = grade;
            System.out.println("Grade Added!!");
            break;
        }
      }
    } else{
        System.out.println("Invalid grade!!");
    }
    }
    
    //OVERLOADED METHOD FOR ABOVE METHOD
    public void addGrade(String subject, double[] grades){
        int subjectIndex = -1;
      boolean subjectFound = false;
      for(int i = 0; i < this.subjectNames.length; i++){
        if(subjectNames[i].equalsIgnoreCase(subject)){
          subjectIndex = i;
          subjectFound = true;
          break;
        }
      }
      if(!subjectFound){
        System.out.println(subject +" Not Found!!!!");
        return;
      }
      this.subjectGrades[subjectIndex] = grades;
    }
    //METHOD FOR GETTING AVERAGE OF A SPECIFIC SUBJECT
    public double getSubjectAverage(String subject){
    int subjectIndex = -1;
      boolean subjectFound = false;
      for(int i = 0; i < this.subjectNames.length; i++){
        if(subjectNames[i].equalsIgnoreCase(subject)){
          subjectIndex = i;
          subjectFound = true;
          break;
        }
      }
      if(!subjectFound){
        System.out.println(subject +" Not Found!!!!");
        return -1;
      }
      double gradesSum = 0;
      for(int i = 0; i < subjectGrades[subjectIndex].length; i++){
          gradesSum += subjectGrades[subjectIndex][i];
      }
      double subjectAvg = gradesSum/subjectGrades[subjectIndex].length;
      return subjectAvg;
    
    }
    
    //METHOD FOR GETTING OVERALL AVERAGE
    public double getOverallAverage(){
      double sum = 0;
      for(int i = 0; i < this.subjectGrades.length; i++){
        for(int j = 0; j < this.subjectGrades[i].length; j++){
           sum += subjectGrades[i][j];
        }
      }
      int totalSizeOfArray = subjectGrades.length*subjectGrades[0].length;
      double OverallAvg = sum/totalSizeOfArray;
      return OverallAvg;
    }
    
    //METHOD FOR GETTING GRADE LETTER
    public char getLetterGrade(double average){
      if(this.getOverallAverage() >= 90 && this.getOverallAverage() <= 100){
                  return 'A';
      }
      else if(this.getOverallAverage() >= 80 && this.getOverallAverage() < 90){
                  return 'B';
      }
      else if(this.getOverallAverage() >= 70 && this.getOverallAverage() < 80){
                  return 'C';
      }
      else if(this.getOverallAverage() >= 60 && this.getOverallAverage() < 70){
                  return 'C';
      }
      else if(this.getOverallAverage() >= 50 && this.getOverallAverage() < 60){
                  return 'D';
      }
      else {
                  return 'F';  
      }
      
    }
    
    //METHOD FOR GETTING BEST SUBJECT
    public String getBestSubject(){
      double[] Averages = new double[subjectNames.length];
      for(int subject = 0; subject < subjectGrades.length; subject++){
          int sum = 0;
          for(int grades = 0; grades < subjectGrades[subject].length; grades++){
              sum += subjectGrades[subject][grades];
          }
          Averages[subject] = sum / subjectGrades[subject].length;   
      }
      
      int maxIndex = 0;
      for(int i = 0; i < Averages.length; i++){
        if(Averages[i] > Averages[maxIndex]){
          maxIndex = i;
        } 
      }
      return subjectNames[maxIndex];
    }
    
    //METHOD FOR GETTING WORST SUBJECT
    public String getWorstSubject(){
      double[] Averages = new double[subjectNames.length];
      
      for(int subject = 0; subject < subjectGrades.length; subject++){
          int sum = 0;
          for(int grades = 0; grades < subjectGrades[subject].length; grades++){
              sum += subjectGrades[subject][grades];
          }
          Averages[subject] = sum / subjectGrades[subject].length;   
      }
      
      int minIndex = 0;
      for(int i = 0; i < Averages.length; i++){
        if(Averages[i] < Averages[minIndex]){
          minIndex = i;
        } 
      }
      return subjectNames[minIndex];
    }
    
    //METHOD FOR CHECKING PASS OR FAIL
    public boolean isPassing(){
      if(this.getOverallAverage() >= 60){
        return true;
      }
      else{
      return false;
    }
    }
    public String getGradeReport(){
      String report = "Name: "+this.studentName+"\nID: "+this.studentId+"\n";
      for(int i = 0; i < subjectGrades.length; i++){
          report += "Subject"+i+": "+subjectNames[i]+" Marks: ";
          for(int j = 0; j < subjectGrades[i].length; j++){
          report += subjectGrades[i][j]+" ";
          }
          report += "\n";
          report += "Average Of " + subjectNames[i] +": "+this.getSubjectAverage(subjectNames[i])+"\n";
      }
      return report;
    }
    
    public int getSubjectCount(){
      return this.subjectGrades.length;
    }
    
    public int getTotalGradeCount(){
    int count = 0;
    for(int i = 0; i < this.subjectGrades.length; i++){
        for(int j = 0; j < this.subjectGrades[i].length; j++){
          count++;
        }
        }
        return count;
    }
}//end of the class
public class GradeManagementSystem{
    public static void main(String[] args){
      String[] Subjects = {"Math", "Science", "English"};
      GradeManager grdMngr = new GradeManager("Abrar Ahmed", "053-24-0021", Subjects);
      grdMngr.addGrade("Math", 96.5);
      grdMngr.addGrade("Math", 78.75);
      grdMngr.addGrade("Math", 89.77);
      
      grdMngr.addGrade("Science", 90);
      grdMngr.addGrade("Science", 89);
      grdMngr.addGrade("Science", 86.5);
      
      grdMngr.addGrade("English", 76.5);
      grdMngr.addGrade("English", 77);
      grdMngr.addGrade("English", 67.50);
    
      System.out.println("Average of Math is : "+grdMngr.getSubjectAverage("Math"));
      System.out.println("Average of Science is : "+grdMngr.getSubjectAverage("Science"));
      System.out.println("Average of English is : "+grdMngr.getSubjectAverage("English")+"\n");
      
      System.out.println("\nIs Passed: "+grdMngr.isPassing()+"\n");
      
      System.out.println("\n"+grdMngr.getGradeReport()+"\n");
      
      System.out.println("Best Subject: "+grdMngr.getBestSubject());
      System.out.println("Worst Subject: "+grdMngr.getWorstSubject());
      
      
    }
}