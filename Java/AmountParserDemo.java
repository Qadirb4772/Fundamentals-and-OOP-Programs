public class AmountParserDemo{
    public static void main(String[] args){
        System.out.println(AmountParser.parseNonNegativeAmount("120.5"));
        try {
              System.out.println(AmountParser.parseNonNegativeAmount("abc"));
              System.out.println(AmountParser.parseNonNegativeAmount("-5"));
          }catch(NumberFormatException ex){
              System.out.println("Not a Number: ");
          }catch(IllegalArgumentException ex){
                System.out.println("Negative numbers are not allowed!!");
          }
       
       
       String[] linesArr1 = { "10", "20.5", "30" };
       String[] linesArr2 = { "1", "x", "-2", "3" };
       
       System.out.println("Sum: "+AmountParser.sumNonNegativeAmounts(linesArr1));
       System.out.println("Invalid Amounts: "+AmountParser.countInvalidAmountLines(linesArr2));
    }
}
