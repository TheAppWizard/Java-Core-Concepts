// Superclass (Parent Class)
class Animal {
    // Method in the parent class

    
    @SuppressWarnings("unused")/// vscode ignore
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass (Child Class) that overrides the method
class Dog extends Animal {
    // Overriding the sound() method from the parent class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another Subclass (Child Class) that also overrides the method
class Cat extends Animal {
    // Overriding the sound() method from the parent class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating objects of the child classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Calling the sound() method for both animals
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}
