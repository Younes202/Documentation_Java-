import java.util.Scanner;

class java_3 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
    System.out.println("Write the amount of product one ");
    int amount_one = input.nextInt();
    
    System.out.println("Write the price of product one ");
    
        float price_one = input.nextFloat();

    System.out.println("Write the amount of product two ");
    
    int amount_two = input.nextInt();
    System.out.println("Write the price of product two ");
    float price_two = input.nextFloat();
    
    
    System.out.println("Write the amount of product three ");
    
    int amount_three = input.nextInt();
    System.out.println("Write the price of product three ");
    float price_three = input.nextFloat();
    double sum = ((amount_one *price_one )+(amount_two *price_two)+((amount_three * price_three)*0.9));
    System.out.println("Total of command is : " + sum); 
    double ttc = sum*0.2;
    System.out.println("TTC of this command is : " +(sum + ttc)); 
    
    
    
    
     
     
     


      
    }
}