/// Parent class
class Animal {
    String name = "Generic Animal";
}

// Child class
class Dog extends Animal {
    String name = "Buddy";

    void displayInfo() {
        System.out.println("Dog name (child class): " + name);
        System.out.println("Animal name (parent class): " + super.name);  // Accessing parent class variable
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog();
        
        // Calling the displayInfo() method
        myDog.displayInfo();  
    }
}
