class Animal {
    public static void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public static void eat() {
        System.out.println("Dog is eating");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Animal.eat(); // Calls the static method from the Animal class
        Dog.eat();    // Calls the hidden static method from the Dog class
    }
}
