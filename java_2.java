import java.util.Scanner;

class java_2 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
     System.out.println("Write a day , month , year  ((of birthday)");
     short day = input.nextShort();
     short month = input.nextShort();
     short year = input.nextShort();
     input.nextLine();
      System.out.println("Wirte your name");
         String name = input.nextLine();
                System.out.println("Hello M mm"+ name +"your birthday date is  :" +day+","+month+","+year);

     


      
    }
}