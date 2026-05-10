public class StackDemo{
  public static void main(String[] args){
    Stack stack = new Stack();
    stack.setSize(6);
    
    stack.push(12);
    stack.push(14);
    stack.push(25);
    stack.push(27);
    stack.push(22);
    stack.push(20);
    //stack.push(89);
    
    /*System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());*/
    
    stack.clearStack();
    
    System.out.println(stack.pop());
  }
}
