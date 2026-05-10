import java.util.Scanner;

public class MainA{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter order info(name,type,qty,price): ");
    String input = sc.nextLine();
    
    String[] arr = input.trim().split(",");
    Orderable[] orderArr =new Orderable[1];
    double price = Double.parseDouble(arr[3]);
    int qty = Integer.parseInt(arr[2]);
    try {
    if(arr[1].equalsIgnoreCase("Food") || arr[1].equalsIgnoreCase("F")){
        FoodOrder foodOrder = new FoodOrder(arr[0], price, qty);
        orderArr[0]  = foodOrder;
    }else if(arr[1].equalsIgnoreCase("Grocery") || arr[1].equalsIgnoreCase("G")){
        GroceryOrder groceryOrder = new GroceryOrder(arr[0], price, qty);
        orderArr[0] = groceryOrder;
      }
    else if(arr[1].equalsIgnoreCase("Express") || arr[1].equalsIgnoreCase("E")){
        ExpressOrder eOrder = new ExpressOrder(arr[0], price);
        orderArr[0] = eOrder;
      }
      
      for(Orderable order: orderArr){
        System.out.println("Type: "+order.getType());
        System.out.println("Total: "+order.getTotal());
      }
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }
}
