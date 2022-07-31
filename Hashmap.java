
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
import java.util.HashMap;

class Personne {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<Integer, String> map = new HashMap();
    map.put(1, "Hello I have key : 1");
    map.put(2, "Hello I have key : 2");
    map.put(12, "Hello I have key : 12");
    for (String mes : map.values()) {
      System.out.println(mes);
    }

    map.remove(2);
    System.out.println("After Remove element has key : 2");
    for (String mes : map.values()) {
      System.out.println(mes);
    }

  }
}
