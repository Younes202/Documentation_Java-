import java.util.Scanner;

import java.util.*;

class Personne {
  Scanner input = new Scanner(System.in);

  int id = Nextid();
  String name;
  String lastname;
  String phone;
  int age;
  Personne prof;

  public int Nextid() {
    return id++;
  }

  Personne() {
    this.name = "";
    this.lastname = "";
    this.phone = "";
    this.age = 0;
    this.prof = null;

  }

  Personne(String name, String lastname, String phone, int age, Personne prof) {
    this.name = name;
    this.lastname = lastname;
    this.phone = phone;
    this.age = age;
    this.prof = prof;
  }

  public int getid() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getLastName() {
    return this.lastname;
  }

  public String getphone() {
    return this.phone;
  }

  public int getAge() {
    return this.age;
  }

  public Personne getprof() {
    return this.prof;
  }

  public String toString() {
    return name + " " + lastname + " " + phone + " " + age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastname = lastName;
  }

  public void setphone(String ph) {
    this.phone = ph;
  }

  public void setage(int age) {
    this.age = age;
  }

  public void setprof(Personne pr) {
    this.prof = pr;
  }

  public void Display() {
    System.out.println("id :" + getid());
    System.out.println("Name :" + getName());
    System.out.println("LastName :" + getLastName());
    System.out.println("Age : " + getAge());
    System.out.println("Phone :" + getphone());
  }

  public void Write() {
    System.out.println("Write your Name :");
    this.name = input.nextLine();
    System.out.println("Write your LastName :");
    this.lastname = input.nextLine();
    System.out.println("Write your phone:");
    this.phone = input.nextLine();
    System.out.println("Write your Age :");
    this.age = input.nextInt();
  }

  public void Displaycroissante() {
    System.out.println(this.toString());
    if (prof != null) {
      prof.Displaycroissante();
    }

  }

  public void DisplayDecroissante() {

    if (prof != null) {
      prof.Displaycroissante();
    }
    System.out.println(this.toString());
  }

  public boolean serchwithname(String namer) {
    if (name.equals(namer)) {
      System.out.println("Its' afound");
      return true;

    } else {
      if (prof == null) {
        return false;

      } else {
        return prof.serchwithname(namer);
      }
    }
  }

  public Personne searchwithnameprof(String namerr) {
    if (name.equals(namerr)) {
      System.out.println("Its' afound");

      return this;
    } else {
      if (prof == null) {
        return null;
      } else {
        return prof.searchwithnameprof(namerr);
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Personne a = new Personne("younes", "sghyer", "0668542423", 21, null);
    a = new Personne("yoy", "sghyer", "0668542423", 21, a);
    a = new Personne("bob", "sghyer", "0668542423", 21, a);
    a.searchwithnameprof("younes");
  }
}
