// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass that extends abstract class
class Dog extends Animal {
    // Must override the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassMethods {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Not allowed - abstract class cannot be instantiated

        Dog myDog = new Dog();  // ✅ Allowed
        myDog.makeSound();      // Output: Dog barks
        myDog.sleep();          // Output: Sleeping...
    }
}
