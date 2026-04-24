public class AmountParser{
  
  public static double parseNonNegativeAmount(String text){
    if(text.trim().isEmpty()){
      throw new IllegalArgumentException("Sorry! the text is empty please enter a non negative amount");
    }
    try{
        double nonNegativeNo = Double.parseDouble(text);
        if(nonNegativeNo < 0)
           throw new IllegalArgumentException("Negative amounts are not allowed!!");
          
        return nonNegativeNo;
          
        
    }catch(NumberFormatException e){
        throw new NumberFormatException("Not a Number: "+text);
    }
  }
  
  public static double sumNonNegativeAmounts(String[] lines){
    double sum = 0;
      if(lines == null){
          throw new IllegalArgumentException("Array is Null");
      }
      else{
          for(int i = 0; i < lines.length; i++){
              try {
                  sum += parseNonNegativeAmount(lines[i]);
              }catch(IllegalArgumentException ex){
                  System.out.println("Bad Amount at index: "+i);
              }
          }
      }
      return sum;
  }
  
  public static int countInvalidAmountLines(String[] lines){
      int invalidAmounts = 0;
      if(lines == null){
          return invalidAmounts;
      }
      for(int i = 0; i < lines.length; i++){
        try {
            double amount = parseNonNegativeAmount(lines[i]);
        }catch(IllegalArgumentException ex){
            invalidAmounts++;
        }
      }
      return invalidAmounts;
  }
  
}
