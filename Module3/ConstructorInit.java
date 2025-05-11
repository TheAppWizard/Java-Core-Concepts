public class ConstructorInit {
    String brand;
    int year;

    // Constructor (same name as the class)
    ConstructorInit(String b, int y) {
        brand = b;
        year = y;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object with values
        ConstructorInit myCar = new ConstructorInit("Honda", 2023);
        ConstructorInit myCar2 = new ConstructorInit("Skoda", 2023);

        // Display the car's info
        myCar.displayInfo();
        myCar2.displayInfo();
    }
}
