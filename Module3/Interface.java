// First interface
interface Flyable {
    void fly();  // abstract method
}

// Second interface
interface Swimmable {
    void swim();  // abstract method
}

// A class implementing both interfaces (multiple inheritance)
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }


    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();   // Output: Duck is flying.
        d.swim();  // Output: Duck is swimming.
    }
}
