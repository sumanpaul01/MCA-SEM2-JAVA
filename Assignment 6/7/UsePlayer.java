/*Create an interface called Player. The interface has an abstract method called play()
that displays a message describing the meaning of “play” to the class. Create classes
called Child, Musician, and Actor that all implement Player. Create an application
that demonstrates the use of the classes(UsePlayer.java*/

// Player interface
interface Player {
    void play();
}

// Child class implementing Player
class Child implements Player {
    @Override
    public void play() {
        System.out.println("For a child, playing means having fun and engaging in activities for enjoyment.");
    }
}

// Musician class implementing Player
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("For a musician, playing means performing music with an instrument or voice.");
    }
}

// Actor class implementing Player
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("For an actor, playing means portraying a character in a performance.");
    }
}

// UsePlayer class to demonstrate the use of Player, Child, Musician, and Actor classes
public class UsePlayer {
    public static void main(String[] args) {
        // Creating instances of Child, Musician, and Actor
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        // Demonstrating the play method for each class
        System.out.println("Child:");
        child.play();
        System.out.println("\nMusician:");
        musician.play();
        System.out.println("\nActor:");
        actor.play();
    }
}
