// Method              | What It Does (Layman Explanation)                      | Example                        | Output
// -------------------|--------------------------------------------------------|--------------------------------|------------------
// length()            | Tells you how many characters are in the string       | "hello".length()               | 5
// charAt(index)       | Gets the character at a specific position (starts at 0)| "hello".charAt(1)              | 'e'
// toUpperCase()       | Converts all letters to CAPITALS                      | "hello".toUpperCase()          | "HELLO"
// toLowerCase()       | Converts all letters to lowercase                     | "HELLO".toLowerCase()          | "hello"
// equals()            | Compares two strings (case-sensitive)                 | "java".equals("Java")          | false
// equalsIgnoreCase()  | Compares two strings (ignores upper/lowercase)       | "java".equalsIgnoreCase("Java")| true
// contains()          | Checks if the string has a certain word/letter        | "apple".contains("pp")         | true
// startsWith()        | Checks if the string starts with something            | "apple".startsWith("a")        | true
// endsWith()          | Checks if the string ends with something              | "apple".endsWith("e")          | true
// indexOf()           | Finds the first position of a letter/word             | "banana".indexOf("a")          | 1
// lastIndexOf()       | Finds the last position of a letter/word              | "banana".lastIndexOf("a")      | 5
// substring()         | Cuts out part of the string                           | "hello".substring(1, 4)        | "ell"
// replace()           | Replaces one part with another                        | "cat".replace("c", "b")        | "bat"
// trim()              | Removes spaces from the start and end of the string   | " hello ".trim()               | "hello"
// isEmpty()           | Checks if the string is completely empty ("")         | "".isEmpty()                   | true
// split()             | Breaks a string into pieces based on a separator      | "a,b,c".split(",")             | ["a", "b", "c"]
// concat()            | Adds (joins) two strings together                     | "Hello ".concat("World")       | "Hello World"


public class StringMethods {
    public static void main(String[] args) {
        String text = "  Java Programming  ";

        System.out.println("Original: '" + text + "'");
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Contains 'gram': " + text.contains("gram"));
        System.out.println("Starts with 'Java': " + text.trim().startsWith("Java"));
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 5: " + text.charAt(5));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
    }
}
