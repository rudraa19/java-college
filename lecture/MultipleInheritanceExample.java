// Write a java program to demonstrate multiple inheritance using interface. Create two interfaces Animal and Pet with their respective methods then implement both interfaces in a class Dog and demonstrate the calling the methods using an object of a dog.

interface Animal {
    void bark();
}

interface Pet {
    void run();
}

class Dog implements Animal, Pet {
    public void bark() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog is running...");
    }
}

public class MultipleInheritanceExample{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.run();
    }
}

