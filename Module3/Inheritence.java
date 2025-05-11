// Superclass (Parent Class)
class Vehicle {
    String brand;

    // Constructor for Vehicle class
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to display vehicle info
    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass (Child Class) that inherits from Vehicle
class Car extends Vehicle {
    int year;

    // Constructor for Car class
    Car(String brand, int year) {
        // Call the parent class constructor to set the brand
        super(brand);  
        this.year = year;
    }

    // Method to display car info (it can add more details)
    void displayCarInfo() {
        displayInfo();  // Calling the parent class method
        System.out.println("Year: " + year);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2020);

        // Call the method to display car information
        myCar.displayCarInfo();
    }
}
