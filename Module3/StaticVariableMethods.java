public class StaticVariableMethods {
    String brand;
    int year;

    // Static variable: shared by all objects
    static int carCount = 0;  // Keeps track of how many cars are created

    // Constructor: Every time a car is created, it increases the count
    StaticVariableMethods(String brand, int year) {
        this.brand = brand;
        this.year = year;
        carCount++;  // Increases the car count every time a new car is created
    }

    // Static method: Can be called without creating an object
    static void displayCarCount() {
        System.out.println("Total cars created: " + carCount);
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Create cars
        StaticVariableMethods car1 = new StaticVariableMethods("Toyota", 2020);
        StaticVariableMethods car2 = new StaticVariableMethods("Honda", 2021);

        // Call the static method to display car count
        StaticVariableMethods.displayCarCount();  // Output: Total cars created: 2

        // Show individual car info
        car1.displayInfo();  // Output: Brand: Toyota, Year: 2020
        car2.displayInfo();  // Output: Brand: Honda, Year: 2021
    }
}
