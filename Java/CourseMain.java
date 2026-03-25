public class CourseMain{
    public static void main(String[] args){
      Course course = new Course("CS-101", 3);
      LabCourse lab = new LabCourse("CS-113", 1, 1500);
      OnlineCourse onlineCourse = new OnlineCourse("CS-109", 3, 1600);
      
      System.out.println("Fee for Course: "+course.totalFee());
      System.out.println("Fee for Lab Course: "+lab.totalFee());
      System.out.println("Fee for Online Course: "+onlineCourse.totalFee());
    }
}
