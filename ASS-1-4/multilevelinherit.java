class Animal {
  void eat() {
      System.out.println("Animal is eating.");
  }
}
class Dog extends Animal {
  void bark() {
      System.out.println("Dog is barking.");
  }
  Dog() {
      super(); 
  }
}
class Bulldog extends Dog {
  void guard() {
      System.out.println("Bulldog is guarding.");
  }
  Bulldog() {
      super(); 
  }
}
public class multilevelinherit {
  public static void main(String[] args) {
      Bulldog myDog = new Bulldog();
      myDog.eat();    
      myDog.bark();   
      myDog.guard();  
  }
}
