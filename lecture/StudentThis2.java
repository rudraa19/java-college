public class StudentThis2 {
  int rollno;
  String name;
  float fee;
  StudentThis2(int rollno, String name, float fee){
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
  }
  void display(){System.out.println(rollno+" "+name+" "+fee);}

  public static void main(String[] args) {
    StudentThis2 s1 = new StudentThis2(111, "Rudra", 5000f);
    StudentThis2 s2 = new StudentThis2(112, "Vaibhav", 5000f);

    s1.display();
    s2.display();
  }
}
