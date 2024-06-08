/*Create three interfaces, each with two methods. Inherit a new interface from the three, 
adding a new method. Create a class by implementing the new interface and also 
inheriting from a concrete class. Now write four methods, each of which takes one of the 
four interfaces as an argument. In main ( ), create an object of your class and pass it to 
each of the methods.*/

// Define three interfaces with two methods each
interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}

// Inherit a new interface from the three and add a new method
interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

// Concrete class to inherit from
class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete method");
    }
}

// Implement the new interface and inherit from the concrete class
class MyClass implements NewInterface {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method5() {
        System.out.println("Method 5");
    }

    @Override
    public void method6() {
        System.out.println("Method 6");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method");
    }
}

public class Test {
    // Method takes NewInterface as an argument
    static void method1(NewInterface obj) {
        obj.method1();
    }

    // Method takes Interface1 as an argument
    static void method2(Interface1 obj) {
        obj.method2();
    }

    // Method takes Interface2 as an argument
    static void method3(Interface2 obj) {
        obj.method3();
    }

    // Method takes Interface3 as an argument
    static void method4(Interface3 obj) {
        obj.method6();
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        // Call each method passing myObj
        method1(myObj);
        method2(myObj);
        method3(myObj);
        method4(myObj);
    }
}
