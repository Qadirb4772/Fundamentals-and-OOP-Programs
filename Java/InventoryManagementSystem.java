class Inventory{
  //attributes
    private String productName;
    private String productId;
    private int quantity;
    private double unitPrice;
    private String category;
    private int reorderLevel;

    //getter for productName
    public String getProductName(){
      return this.productName;
    }
    //parameterized Constructor
    Inventory(String productName, String productId, double unitPrice, String category, int reorderLevel){
      if(unitPrice < 0){
        System.out.println("Invalid Unit Price!!!!");
      }
      if(reorderLevel < 0){
        System.out.println("Invalid Re-Order Level!!!!");
      }
      else{
      this.productName = productName;
      this.productId = productId;
      this.unitPrice = unitPrice;
      this.category = category;
      this.reorderLevel = reorderLevel;
    }
  }

    public void addStock(int amount){
      if(amount < 0)
        System.out.println("Invalid Amount!!!!");
      else{
        this.quantity = amount;
      }
    }

    public void removeStock(int amount){
      if(this.quantity < amount){
        System.out.println(amount + this.productName + " is unavailable");
      }
      else if(amount < 0){
        System.out.println("Invalid Amount!!!!");
      }
      else{
        this.quantity -= amount;
      }
    }

    public double getTotalValue(){
      return this.unitPrice*this.quantity;
    }

    public boolean needsReorder(){
      if(this.quantity <= this.reorderLevel){
        return true;
      }
      else{
        return false;
      }
    }

    public void applyDiscount(double percentage){
      if(percentage >= 0 && percentage <= 100){
        this.unitPrice -= (this.unitPrice*percentage)/100;
      }else{
        System.out.println("Invalid percentage");
      }
    }

    public void updatePrice(double newPrice){
      if(newPrice > 0){
      this.unitPrice = newPrice;
    }else{
      System.out.println("Invalid Price");
    }
    }

    public String getStockStatus(){
      if(this.quantity > this.reorderLevel){
        return "In Stock";
      }
      else if(this.quantity < this.reorderLevel){
        return "Out Of Stock";
      }
      else{
        return "Low Stock";
      }
    }

    public double calculateBulkPrice(int quantity){
      if(quantity > 0){
      if(quantity >= 10){
        return (quantity*this.unitPrice)*(10)/100;
      }
      else{
        return quantity*this.unitPrice;
      }
    }
    else{
      System.out.println("Invalid Quantity!!!");
      return -1;
    }
    }

    public String getInventoryInfo(){
      String inventoryInfoString = "Product Name: "+this.productName+"\nProduct ID: " + this.productId+"\nUnit Price: "+this.unitPrice+"\nCategory: "+this.category+"\nQuantity: "+this.quantity+"\nRe-Order Level: "+this.reorderLevel+"\nStatus: "+this.getStockStatus();
      return inventoryInfoString;
    }

    public int compareValue(Inventory other){
      if(this.unitPrice > other.unitPrice){
        return 1;
      }
      else if(this.unitPrice < other.unitPrice){
        return -1;
      }
      else{
        return 0;
      }
    }

    public static double getTotalInventoryValue(Inventory[] products){
      double totalValue = 0;
      for(int i = 0; i < products.length; i++){
        totalValue += (products[i].unitPrice*products[i].quantity);
      }
      return totalValue;
    }

}
public class InventoryManagementSystem{
      public static void main(String[] args){
        Inventory inventory1 = new Inventory("Milk", "INV001", 419.63, "Dairy", 15);
        Inventory inventory2 = new Inventory("Bread", "INV002", 335.70, "Bakery", 10);
        Inventory inventory3 = new Inventory("Eggs", "INV003", 240.5, "Dairy", 15);
        Inventory inventory4 = new Inventory("Butter", "INV004", 419.63, "Dairy", 15);

        //Adding Stocks
        inventory1.addStock(13);
        inventory2.addStock(14);
        inventory3.addStock(19);
        inventory4.addStock(28);
        //removing Stocks
        inventory1.removeStock(10);
        inventory2.removeStock(11);
        inventory3.removeStock(19);
        inventory4.removeStock(25);
        //checking re-order Statuses for each
        System.out.println("Should Milk be reordered "+inventory1.needsReorder());
        System.out.println("Should Bread be reordered "+inventory2.needsReorder());
        System.out.println("Should Eggs be reordered "+inventory3.needsReorder());
        System.out.println("Should Butter be reordered "+inventory4.needsReorder());

        //applying discounts
        inventory1.applyDiscount(10);
        inventory2.applyDiscount(-19);
        inventory3.applyDiscount(15);
        inventory4.applyDiscount(-20);

        //calculating values
        System.out.println("10 Milk items = "+inventory1.calculateBulkPrice(10));
        System.out.println("12 Egg dozen = "+inventory3.calculateBulkPrice(12));
        System.out.println("5 Bread items = "+inventory2.calculateBulkPrice(5));
        System.out.println("6 Butter items = "+inventory4.calculateBulkPrice(6));
        
        //comparing Milk with Bread
        if(inventory1.compareValue(inventory2) == 1){
          System.out.println(inventory1.getProductName()+" has higher value than "+inventory2.getProductName());
        }
        else if(inventory1.compareValue(inventory2) == -1){
          System.out.println(inventory1.getProductName()+" has higher value than "+inventory2.getProductName());
        }
        else{
          System.out.println(inventory1.getProductName()+" and "+inventory2.getProductName()+" both have equal values");
        }
        //using static method to get total inventory value
        Inventory[] inventory = new Inventory[4];
          inventory[0] = inventory1;
          inventory[1] = inventory2;
          inventory[2] = inventory3;
          inventory[3] = inventory4;
        
        System.out.println("Total Inventory Value = "+Inventory.getTotalInventoryValue(inventory));
      }
}
