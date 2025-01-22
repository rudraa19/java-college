public class StudentThis1 {
  int rollno;
  String name;
  float fee;
  StudentThis1(int rollno, String name, float fee){
    rollno=rollno;
    name=name;
    fee=fee;
  }
  void display(){System.out.println(rollno+" "+name+" "+fee);}

  public static void main(String[] args) {
    StudentThis1 s1 = new StudentThis1(111, "Rudra", 5000f);
    StudentThis1 s2 = new StudentThis1(112, "Vaibhav", 5000f);

    s1.display();
    s2.display();
  }
}
