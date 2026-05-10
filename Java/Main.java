import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Book (title,  type,  lateDays): ");
    String str = sc.nextLine();
    
    String[] arr = str.split(",");
    int lateDays = 0;
    
     try {
        lateDays = Integer.parseInt(arr[2]);
      }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
      }
    if(arr[1].equalsIgnoreCase("book")){      
      Book b = new Book("Java The Complete Reference");
      try {
          b.borrowItem();
          b.returnItem();
      }catch(LibraryException e){
          System.out.println(e.getMessage());
      }
      
      System.out.println("Fine is: "+b.calculateFine(lateDays));
    }
    else if(arr[1].equalsIgnoreCase("dvd")){
      try {
        lateDays = Integer.parseInt(arr[2]);
      }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
      }
      
      DVD d = new DVD("RRR");
      try {
          d.borrowItem();
          d.returnItem();
     }catch (LibraryException e){
        System.out.println(e.getMessage());
     }
      
      
      System.out.println("Fine is: "+d.calculateFine(lateDays));
      try {
          d.returnItem();
      }catch (LibraryException e){
          System.out.println(e.getMessage());
      }
    }
    else if(arr[1].equalsIgnoreCase("ref")){
      ReferenceBook ref = new ReferenceBook("Ref Book");
      
      try {
          ref.borrowItem();
          ref.returnItem();
     }catch(LibraryException e){
          System.out.println("Invalid Action cannot borrow or return reference book");    
         }
    }
    
  }
}
