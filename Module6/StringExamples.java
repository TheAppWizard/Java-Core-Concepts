public class StringExamples {
    public static void main(String[] args) {
        
        // -------------------------
        // 1. Using String (Immutable)
        // -------------------------
        String s = "Hello";  
        // Each time we add something, a NEW string is created behind the scenes
        s = s + " John";
        s = s + " Jane";
        s = s + " Alex";
        System.out.println("Using String: " + s);  
        // Output: Hello John Jane Alex
        // ❗ Not memory efficient because it creates new strings every time

        
        // -------------------------------
        // 2. Using StringBuilder (Mutable)
        // -------------------------------
        StringBuilder sb = new StringBuilder("Hello");
        // We can add names directly without creating new objects
        sb.append(" John");
        sb.append(" Jane");
        sb.append(" Alex");
        System.out.println("Using StringBuilder: " + sb.toString());
        // Output: Hello John Jane Alex
        // ✅ Fast and memory-friendly (best for single-threaded programs)

        
        // --------------------------------
        // 3. Using StringBuffer (Thread-safe)
        // --------------------------------
        @SuppressWarnings("StringBufferMayBeStringBuilder") ///Ignore VS Code
        StringBuffer sbf = new StringBuffer("Hello");
        // Works just like StringBuilder, but is safe to use with multiple threads
        sbf.append(" John");
        sbf.append(" Jane");
        sbf.append(" Alex");
        System.out.println("Using StringBuffer: " + sbf.toString());
        // Output: Hello John Jane Alex
        // ✅ Safe for multi-threading but slightly slower than StringBuilder
    }
}
