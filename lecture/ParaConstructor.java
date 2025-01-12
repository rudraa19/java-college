public class ParaConstructor {
    int id;
    String name;

    ParaConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + ": " + name);
    }

    public static void main(String[] args) {
        ParaConstructor p1 = new ParaConstructor(111, "Rudra");
        ParaConstructor p2 = new ParaConstructor(112, "Yash");

        p1.display();
        p2.display();
    }
}