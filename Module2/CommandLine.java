public class CommandLine{
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length > 0) {
            System.out.println("You passed " + args.length + " arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments were provided.");
        }
    }
}


/// First Compile : javac CommandLine.java
/// Run :  java CommandLine Apple Banana Cherry
