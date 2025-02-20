// write a java program to demonstrate the use of local inner class. Create a class outer with method display. Define local inner class inner that prints a message. instantiate the inner class inside display and call its method.

class Outer {
    void display() {
        class Inner {
            void message() {
                System.out.println("Hey there");
            }
        }
        Inner inner = new Inner();
        inner.message();
    }
}

public class LocalInnerClassExample{
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
