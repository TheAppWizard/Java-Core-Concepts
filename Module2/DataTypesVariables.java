public class DataTypesVariables {
    public static void main(String[] args) {
        
        // Integer types
        byte age = 25;             // small number (-128 to 127)
        short year = 2025;         // larger than byte
        int population = 1000000;  // commonly used whole number
        long distance = 123456789L; // very large number, add 'L' at the end

        // Floating-point types
        float price = 99.99f;      // smaller decimal number, use 'f' at the end
        double pi = 3.14159;       // more precise decimal number

        // Character type
        char grade = 'A';          // single character in single quotes

        // Boolean type
        boolean isJavaFun = true;  // true or false

        // String (not a primitive, but used often)
        String name = "Alice";

        // Print all values
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Price: $" + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Name: " + name);
    }
}
