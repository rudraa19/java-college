// Write a java program to demonstrate inheritance. Create a base class person with attributes name and age and a method to display them then create a derived class student that extends a person by adding an additional attribute grade. Implement a method in student to display all details.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age); 
        this.grade = grade;
    }

    void display() {
        super.display(); 
        System.out.println("Grade: " + grade);
    }
}

public class PersonInheritance{
    public static void main(String[] args) {
        Student student = new Student("Rudra", 19, "A");
        
        student.display();
    }
}
