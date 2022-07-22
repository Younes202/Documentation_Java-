import java.util.Scanner;
class java_9 {
  public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
       System.out.println("Write Number of Students ");
        int N = input.nextInt();
        int notes[]=new int[N];
        int i=0;
        int j=0;
        int z=0;
        int moy=1; 
        while(i<N){
            System.out.println("Write marks of studens :"+(i+1));
           notes[i] = input.nextInt();
          i++;
        }
         for(j=0;j<notes.length;j++)
         {
             if(notes[j]>=10){
               moy+=z;
               moy++;
                 
             }
             else
             {
             break;
             }  
         }
                System.out.println("Students that have mark over    :" +(moy-1));       
  }
}

        

         
            
   

    
       
