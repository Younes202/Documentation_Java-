import java.util.Scanner;

import java.util.*;

class Main {
  static void reverse(String a[]) {
    Collections.reverse(Arrays.asList(a));
    System.out.println(Arrays.asList(a));
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] a = new String[5];
    int i = 0;
    do {
      System.out.println("Array [" + i + "]");
      a[i] = input.nextLine();
      i++;
    } while (i < 5);
    reverse(a);

  }
}
