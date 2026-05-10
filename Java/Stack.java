public class Stack{
  private int size;
  private int[] stackArr;
  private int top;
  Stack(){
    this.size = 0;
    this.stackArr = new int[size];
    this.top = 0;
  }
  
  Stack(int size){
    if(size > 0){
      this.size = size;
    }else {
      System.out.println("Size of stack cannot be negative!!!");
      this.size = 0;
      
    }
    this.top = 0;
    this.stackArr = new int[this.size];
  }
  
  public void setSize(int size){
    if(size < 0){
      System.out.println("Size of stack cannot be negative!!!");
      this.size = 0;
    }else{
      this.size = size; 
    }
    
    this.stackArr = new int[this.size];
  }
  public void push(int num){
    if(top < this.stackArr.length){
      System.out.println(num+" Pushed!!");
      this.stackArr[top++] = num;
    }else{
      System.out.println("Sorry!! The stack is full");
    }
  }
  
  public int pop(){
    if(top == 0){
      System.out.println("Sorry all the stack items have been popped!!!");
      return -1;
    }else{
      System.out.println("Element Popped!!");
      return this.stackArr[--top];
    }
  }
  
  public void clearStack(){
    this.top = 0;
    System.out.println("Stack is Cleared!!!");
  }
  
}
