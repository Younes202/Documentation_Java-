import java.util.Scanner;
class java_7 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
      System.out.println("Program which determines numbers of days according of month");
      System.out.println("Write The month");
      int months = input.nextInt();
      String days = "";
      if(months >=1 && months<=12){
          switch (months)
      {
          case 1,3,5,7,8,10,12: days="31 days";break;
          case 4,6,9,11: days="30 days";break;
          case 2: days="29 or 28 days  ";break;
      }
          System.out.println("Numbers of days are : " + days);
      }
      
      else{
      System.out.println("Error");
      
      }
          
     
      
      
        
      
     
      
      
   
   
        
  }
}