// Java program to demonstrate the use of static variable

public class Student {
  int rollno;
  String name;
  static String college="ADIT";

  Student(int r, String n){
    rollno = r;
    name = n;
  }

  void display() {
    System.out.println(rollno+" "+name+" "+college);
  }
  public static void main(String[] args) {
    Student s1 = new Student(111, "Rudra");
    Student s2 = new Student(112, "Vaibhav");

    Student.college = "CVMU";

    s1.display();
    s2.display();
  }
}
