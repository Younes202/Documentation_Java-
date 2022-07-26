import java.util.Scanner;

import java.util.*;

class Main {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 int [][]array = {{12,3,2},{1,2,3},{4,5,6}};
  int [][]array_1 = {{12,3,2},{1,2,3},{4,5,6}};
  int sum[][]=new int[3][3];
    for(int a=0;a<array.length;a++){
    for(int c=0;c<array_1.length;c++){
    sum[a][c]=array[a][c] + array_1[a][c];     
      System.out.println(sum[a][c]);  
    }
}

}}
