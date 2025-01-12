public class DefaultConstructor {
    int id;
    String name;
    void display(){System.out.println(id + ": " + name);}

    public static void main(String[] args) {
        DefaultConstructor d1 = new DefaultConstructor();
        DefaultConstructor d2 = new DefaultConstructor();

        d1.display();       // output: 0: null
        d2.display();       // output: 0: null
    }
}