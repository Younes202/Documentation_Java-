import java.util.Scanner;

import java.util.*;

class Personne {
  Scanner input = new Scanner(System.in);

  int id = Nextid();
  String name;
  String lastname;
  String phone;
  int age;

  public int Nextid() {
    return id++;
  }

  Personne() {
    this.name = "";
    this.lastname = "";
    this.phone = "";
    this.age = 0;
  }

  Personne(String name, String lastname, String phone, int age) {
    this.name = name;
    this.lastname = lastname;
    this.phone = phone;
    this.age = age;
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

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Personne a = new Personne();
    a.Write();
    a.Display();

  }
}
