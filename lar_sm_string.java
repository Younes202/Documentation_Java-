import java.util.Scanner;

class java_9 {
  public static void main(String[] args) {
       Scanner  input = new Scanner(System.in);
       System.out.println("fill this array with 5 string");
       int i=0;
       String []arraystring=new String[5];
       do
       {
          System.out.println("fill this : array["+(i+1)+"]");
          arraystring[i]=input.nextLine();
          i++;
          
       }while(i<5);
       String max = arraystring[0],min = arraystring[0];
       System.out.println("content of Array (String) ");
       for(int j=0;j<arraystring.length;j++)
       {
        if(arraystring[j].length()>max.length())
             max=arraystring[j];
        if(arraystring[j].length()<min.length())
        {
            min = arraystring[j];
       }}
       System.out.println("The largest String in this arraystring is : "+max+" " +" whitch has : "+max.length() +" caracters");
       System.out.println("The smallest String in this arraystring is : "+min+" " +" whitch has : "+min.length() +" caracters");

       
  }}
    
       
