
import java.util.Scanner;
import java.util.*;

import java.util.Comparator;
import java.util.Arrays;

import java.util.Stack;
import java.util.HashMap;
class Personne {
  private int id;    
  private String firstname,name,address,email,phone;

  Personne(int i, String fn, String n, String ad, String em, String ph) {
    this.id = i;
    this.firstname = fn;
    this.name = n;
    this.address = ad;
    this.email = em;
    this.phone = ph;
  }

  public String toString() {
    return this.id + " " + this.firstname;
  }

  public int getid() {
    return this.id;
  }

  public class SortById implements Comparator<Personne> {
    public int compare(Personne u, Personne d) {
      if (u.getid() > d.getid()) {
        return 1;
      } else {
        if (u.getid() < d.getid()) {
          return -1;
        } else {
          return 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Personne> liste = new ArrayList();
    liste.add(new Personne(1, "pr 1 ", "pr 2", "addr 1", "em 1", "pho 1"));

    liste.add(new Personne(4, "pr 4 ", "pr 4", "addr 4", "em 4", "pho 4"));

    liste.add(new Personne(2, "pr 2", "pr 2", "addr 2", "em 2", "pho 2"));
    System.out.println("Before Sorting ");
    for (Personne pr : liste) {
      }

     


    Collections.sort(liste,new SortById());
    for (Personne c : liste) {
      System.out.println(c.toString());
    }
  }
}
