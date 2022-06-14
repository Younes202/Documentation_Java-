import java.util.Scanner;

class java_4 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
       int b=0;
      int sm=0;
     System.out.println("The big number and small number");
     
     System.out.println("Write x :");
     int x = input.nextInt();
    System.out.println("Write y :");
      int y = input.nextInt();
     System.out.println("Write z :");
      int z = input.nextInt();
     
      if(x>y && x>z){ b = x;}
      if(x<y && x<z){ sm = x;}
       if(y>x && y>z){ b = y;}
       if(y<x && y<z){ sm = y;}
       if(z>x && z>y){ b = z;}
       if(z<x && z<y){ sm = z;}
       
      System.out.println("The biggest number is "+b);
      System.out.println("The smallet number is "+sm);
      
      
      
       
          
      
     
     
     
  }
}