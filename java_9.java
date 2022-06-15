import java.util.Scanner;
class java_9 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
       System.out.println("Factorial of a number");
    System.out.println("Write  number");
    int s = input.nextInt();
    int i=1;
     int fac = 1;
    for(i=1;i<=s;i++)
    {
       fac*=i;
               }
   
    System.out.println("Fac is  :" +fac);
  }
}