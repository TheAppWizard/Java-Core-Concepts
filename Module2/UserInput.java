import java.util.Scanner;   ///import Library

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Taking different types of input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // read string

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // read integer

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();  // read decimal number

        // Output the entered data
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}


/// First Compile : javac UserInput.java
/// Run :  java UserInput
