// This is a class named Car
public class ClassObjects {
   
   //🔹 You’re saying every car (object) will have:
   ///a brand name (like "Toyota")
   ///a year (like 2022)


    String brand;
    int year;

    // Method (behavior)
    //🔹 This is a function (called a method) that prints the car’s details.
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of Car
        ClassObjects myCar = new ClassObjects();

        // Assigning values to the object's properties
        myCar.brand = "Toyota";
        myCar.year = 2022;

        // Calling a method using the object
        myCar.displayInfo();
    }
}
