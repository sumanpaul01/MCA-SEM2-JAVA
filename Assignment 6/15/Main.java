/*write a java Program to create a interface 'Mango' and implement it in classes 'Winter' and 'Summer'

*/

// Interface Mango
interface Mango {
    void ripen(); // Abstract method
}

// Class Winter implementing Mango interface
class Winter implements Mango {
    @Override
    public void ripen() {
        System.out.println("Winter mango is ripening.");
    }
}

// Class Summer implementing Mango interface
class Summer implements Mango {
    @Override
    public void ripen() {
        System.out.println("Summer mango is ripening.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of Winter and Summer classes
        Winter winterMango = new Winter();
        Summer summerMango = new Summer();
        
        // Calling the ripen method on Winter and Summer objects
        winterMango.ripen();
        summerMango.ripen();
    }
}
