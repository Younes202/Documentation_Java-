import java.util.*;
import java.util.Scanner;

class java_9 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
       System.out.println("fill this array with 5 integer");
       int i=0;
       int []arrayinteger=new int[5];
      do
      {
          System.out.println("fill array["+(i+1)+"]");
          arrayinteger[i]=input.nextInt();
          i++;
          
      }while(i<5);
             int max= arrayinteger[0], min=arrayinteger[0];

       System.out.println("The big number of this array ");
      
         for(int j=0;j<arrayinteger.length;j++)
         {
         if(arrayinteger[j]>max)     max = arrayinteger[j];
         if(arrayinteger[j]<min)     min = arrayinteger[j];
         }
        System.out.println("+++ The Largest Value in the array " +max);
        System.out.println("+++ The smallest Value in the array " +min);

  }}
    
       
