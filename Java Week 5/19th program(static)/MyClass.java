/*19. Write a program to demonstrate use of 'static' keyword.*/
public class MyClass {
    // Static variable
    static int staticVar = 10;
    // Static method
    public static void staticMethod() {
        System.out.println("Inside static method. Value of staticVar: " + staticVar);
    }
    // Non-static method
    public void nonStaticMethod() {
        // Static members can be accessed directly inside a non-static method
        System.out.println("Inside non-static method. Value of staticVar: " + staticVar);
    }
    public static void main(String[] args) {
        // Access static variable and static method directly using class name
        System.out.println("Accessing static variable using class name: " + MyClass.staticVar);
        MyClass.staticMethod();
        // Create an object of MyClass
        MyClass obj = new MyClass();
        // Access static variable and static method using object reference
        System.out.println("Accessing static variable using object reference: " + obj.staticVar);
        obj.staticMethod();
        // Access static variable and static method from within a non-static method
        obj.nonStaticMethod();
    }
}