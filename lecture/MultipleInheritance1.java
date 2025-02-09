interface Sound {
    void makeSound();
}

class Dog implements Sound {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Sound {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MultipleInheritance1 {
    public static void main(String[] args) {
        Sound s = new Dog();
        s.makeSound();
    }
}
