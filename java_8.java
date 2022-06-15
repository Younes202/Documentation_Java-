import java.util.Scanner;
class java_8 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
       System.out.println("Calcul sum bettwen two numbers");
    System.out.println("Write a first number");
    int f = input.nextInt();
    System.out.println("Write a second number");
    int s = input.nextInt();
    int a=0;
    while(s>f){
        a+=f++;
    }
   
    System.out.println("sum :" +a);
  }
}