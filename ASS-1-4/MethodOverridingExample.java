class Animal {
  public void sound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
      System.out.println("Dog barks");
  }
}

public class MethodOverridingExample {
  public static void main(String[] args) {
      Animal animal = new Animal();
      Dog dog = new Dog();

      // Method call using Animal reference
      animal.sound(); // Output: Animal makes a sound

      // Method call using Dog reference
      dog.sound();    // Output: Dog barks
  }
}
