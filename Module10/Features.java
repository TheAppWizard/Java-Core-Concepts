// Lambda Expressions: Shortens the code by directly implementing functional interfaces.
// Functional Interfaces: Interfaces with only one abstract method that are used with lambdas.
// Stream API: Allows processing collections with operations like filter(), map(), and collect().
// Method References: A shorthand way of referring to methods, making the code cleaner.
// Default Methods: Interfaces can have methods with default implementations, allowing more flexibility.




import java.util.*;
import java.util.stream.*;

// Functional Interface (with one abstract method)
interface Greeting {
    void sayHello(String name);
    
    // Default method in interface
    default void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}

public class Features {

    public static void main(String[] args) {
        
        // 1. **Lambda Expression** for the Greeting interface
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("John");  // Outputs: Hello, John!
        
        // 2. **Using Default Method** from the interface
        greeting.sayGoodbye();  // Outputs: Goodbye!
        
        // 3. **Stream API** Example: Filtering and modifying a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Stream to filter names starting with 'A' and convert to uppercase
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("B"))  // Filters names starting with 'A'
            .map(String::toUpperCase)              // Converts each name to uppercase
            .collect(Collectors.toList());         // Collects the result into a list
        
        System.out.println(filteredNames);  // Outputs: [ALICE]
        
        // 4. **Method Reference**: Using method reference to print each name
        names.forEach(System.out::println); // Outputs each name in the list
    }
}
