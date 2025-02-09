interface Vehicle {
    void run();
}

class Car implements Vehicle {
    public void run() {
        System.out.println("Car is running");
    }
}

class Bike implements Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }
}

public class MultipleInheritance2 {
    public static void main(String[] args) {
        Vehicle v = new Car(); 
        v.run();
    }
}
