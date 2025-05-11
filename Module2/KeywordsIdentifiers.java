
//-> Keywords
//Reserved words in Java.
//Cannot be used as variable or method names.
//Examples: public, class, int, boolean, static, void, if, else, return
//public, class, int, String, boolean, static, void, and new are keywords.

//-> Identifiers
//Names you give to variables, methods, classes, etc.
//Must begin with a letter, underscore _, or dollar sign $
//Cannot start with a number or use keywords as names.


public class KeywordsIdentifiers {

    /// These are identifiers (names you create)
    int age = 20;                 // 'age' is an identifier
    String name = "John";         // 'name' is an identifier
    boolean isEnrolled = true;    // 'isEnrolled' is an identifier

    public static void main(String[] args) {
        KeywordsIdentifiers student = new KeywordsIdentifiers();  // 'student' is an identifier

        // Accessing and printing the identifiers
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Enrolled: " + student.isEnrolled);
    }
}
