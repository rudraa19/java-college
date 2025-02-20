// Create a class name person with two instance var "name" and "age" create and obj of the class display the values using method. Use "this" key word and create a constructor

public class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void display() {System.out.println("Name: " + name + ", Age: " + age);}

  public static void main(String[] args) {
    Person p = new Person("Rudra", 19);
    p.display();
  }
}
