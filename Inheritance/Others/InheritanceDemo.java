package Inheritance.Others;

abstract class Animal {
    abstract void makeSound();
 public Animal(){
System.out.println("Animal  constructor");
 }
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
    
    void fetch() {
        System.out.println("The dog fetches the ball.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound();
        myAnimal.eat();

        // Downcasting
         if (myAnimal instanceof Dog) {
             Dog myDog = (Dog) myAnimal;
             myDog.fetch();
         }

         Animal myCat = new Cat();
         myCat.makeSound();
    }
}

