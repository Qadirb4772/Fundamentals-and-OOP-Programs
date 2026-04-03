import java.util.Scanner;
class KeyboardSource extends DataSource{
    KeyboardSource(){
    
    }
   
    
    String readLine(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String = ");
        String str = sc.nextLine();
        return str;
    }
}
