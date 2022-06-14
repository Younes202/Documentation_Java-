import java.util.Scanner;

class java_5 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
      System.out.println("Program show sing of product of two number without calculate ");
      System.out.println("Write the first integer ");
      int first = input.nextInt();
      System.out.println("Write the second integer ");
       int second = input.nextInt();
       if((first < 0 && second<0) || (first > 0 && second>0)){System.out.println("Product of this two numbers is positive" );}
       if((first > 0 && second<0)|| (first<0 && second >0)){System.out.println("Product of this two numbers is negative" );}
       
       
      
      
   
   
        
  }
}