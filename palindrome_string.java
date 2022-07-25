import java.util.Scanner;

import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Write a chaine ");
    String a = input.nextLine();
    char archa[] = a.toCharArray();
    boolean t = true;
    for (int i = 0, j = archa.length - 1; i < j; i++, j--) {
      if (archa[i] != archa[j]) {
        t = false;
        break;
      }
    }
    if (t == true) {
      System.out.println(a + "is palindrome");
    } else {
      System.out.println(a + " : isn't palindrome");

    }
  }
}
