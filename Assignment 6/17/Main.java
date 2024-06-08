/*Program to demonstrate use of hierarchical inheritance using interface*/

// Interface defining common behaviors for animals
interface Animal {
    void eat();
    void sleep();
}

// Interface defining behaviors specific to birds
interface Bird extends Animal {
    void fly();
}

// Interface defining behaviors specific to mammals
interface Mammal extends Animal {
    void run();
}

// Concrete class implementing Bird interface
class Sparrow implements Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow is sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

// Concrete class implementing Mammal interface
class Dog implements Mammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Sparrow and Dog classes
        Sparrow sparrow = new Sparrow();
        Dog dog = new Dog();

        // Calling methods specific to Sparrow
        sparrow.eat();
        sparrow.sleep();
        sparrow.fly();

        // Calling methods specific to Dog
        dog.eat();
        dog.sleep();
        dog.run();
    }
}
