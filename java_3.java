import java.util.Scanner;

class java_2 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
     System.out.println("Permitation");
     System.out.println("Write X ");
     int x = input.nextInt();
     System.out.println("Write Y ");
     int y = input.nextInt();
          System.out.println("Value of X is = " +x+": and  value of y  is :"+y );
     int c = x;
     x=y;
     y=c;
     System.out.println("New Value of X is = " +x+": and new value of y  is :"+y );
     
     
     


      
    }
}