class Animal {
  String name;
  
  public Animal(String name) {
      this.name = name;
  }
  
  public void eat() {
      System.out.println(name + " is eating.");
  }
}

class Dog extends Animal {
  public Dog(String name) {
      super(name);
  }
  
  public void bark() {
      System.out.println(name + " is barking.");
  }
}

class Cat extends Animal {
  public Cat(String name) {
      super(name);
  }

  public void meow() {
      System.out.println(name + " is meowing.");
  }
}

public class InheritanceExample {
  public static void main(String[] args) {
      Dog myDog = new Dog("Buddy");
      Cat myCat = new Cat("Whiskers");

      myDog.eat();
      myCat.eat();  

      myDog.bark(); 
      myCat.meow(); // Call the meow() method instead of bark()
  }
}
