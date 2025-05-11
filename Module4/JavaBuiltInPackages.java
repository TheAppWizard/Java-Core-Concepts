import java.util.ArrayList;
import java.util.Scanner;

public class JavaBuiltInPackages {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Using ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("Hello, " + name);
        System.out.println("Fruits: " + list);
    }
}



/// First Compile : javac JavaBuiltInPackages.java
/// Run :  java JavaBuiltInPackages


///op
///Enter your name: Shreyas
///Hello, Shreyas
///Fruits: [Apple, Banana]