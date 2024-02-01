package Inheritance.Others;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        // Imagine more complex initialization logic here
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calls the constructor of the abstract class
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Outputs: Buddy says: Bark!
    }
}

