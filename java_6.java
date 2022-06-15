import java.util.Scanner;
class java_6 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
      System.out.println("Program which determines a family allowance according to the number of children");
      System.out.println("Write the number of childrens");
      int chi = input.nextInt();
      String ch = "";
      if(chi >= 1 && chi <3 ){ch = "150DH";}
     if(chi>= 3 && chi <=7 ){ch ="250DH";}
       if(chi>7) ch="350Dh";
      if (chi== 0) ch= "Error";
      System.out.println("Allocation price : --" +ch);
         
     
      
      
        
      
     
      
      
   
   
        
  }
}