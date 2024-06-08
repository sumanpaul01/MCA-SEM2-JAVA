/*Write a program in Java to illustrate the use of interface in Java*/

// Define an interface
interface Animal {
    void makeSound(); // Abstract method
}

// Implement the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Implement the interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Test {
    public static void main(String[] args) {
        // Create objects of Dog and Cat classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        // Call methods
        myDog.makeSound(); // Output will be "Bark"
        myCat.makeSound(); // Output will be "Meow"
    }
}
