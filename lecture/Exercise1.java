/*
 * Create 5 constructor (overloading)
 * 20 objects 
 * display them
 */

 public class Exercise1 {
    int id;
    int rollNo;
    String email;
    String name;

    Exercise1(){}
    Exercise1(int i){
        id = i;
    }
    Exercise1(int i, int r){
        id = i;
        rollNo = r;
    }
    Exercise1(int i, int r, String e){
        id = i;
        rollNo = r;
        email = e;
    }
    Exercise1(int i, int r, String e, String n){
        id = i;
        rollNo = r;
        email = e;
        name = n;
    }

    void display() {
        System.out.println("id: " + id +"\t\tRollNo.: " + rollNo + "\tEmail: " + email + "\tName: " + name);
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        Exercise1 e2 = new Exercise1(101);
        Exercise1 e3 = new Exercise1(102, 12);
        Exercise1 e4 = new Exercise1(103, 13, "rudra.student@gmail.com");
        Exercise1 e5 = new Exercise1(104, 14, "yash.student@gmail.com", "Yash");
        Exercise1 e6 = new Exercise1();
        Exercise1 e7 = new Exercise1(105);
        Exercise1 e8 = new Exercise1(106, 15);
        Exercise1 e9 = new Exercise1(107, 16, "srushti.student@gmail.com");
        Exercise1 e10 = new Exercise1(108, 17, "prachi.student@gmail.com", "Prachi");
        Exercise1 e11 = new Exercise1();
        Exercise1 e12 = new Exercise1(110);
        Exercise1 e13 = new Exercise1(111, 18);
        Exercise1 e14 = new Exercise1(112, 19, "jenim.student@gmail.com");
        Exercise1 e15 = new Exercise1(114, 20, "tushar.student@gmail.com", "Tushar");
        Exercise1 e16 = new Exercise1();
        Exercise1 e17 = new Exercise1(116);
        Exercise1 e18 = new Exercise1(113, 21);
        Exercise1 e19 = new Exercise1(114, 22, "hemin.student@gmail.com");
        Exercise1 e20 = new Exercise1(115, 23, "sachi.student@gmail.com", "Sachi");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();
        e7.display();
        e8.display();
        e9.display();
        e10.display();
        e11.display();
        e12.display();
        e13.display();
        e14.display();
        e15.display();
        e16.display();
        e17.display();
        e18.display();
        e19.display();
        e20.display();
    }
}