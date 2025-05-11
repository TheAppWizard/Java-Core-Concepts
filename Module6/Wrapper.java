public class Wrapper {
    public static void main(String[] args) {
        // Primitive type
        int num = 10;

        // Autoboxing: converting int to Integer object
        Integer obj = num;

        // Unboxing: converting Integer object back to int
        int newNum = obj;

        // Using a method from the wrapper class
        String str = Integer.toString(num);  // Converts int to String

        System.out.println("Wrapped object: " + obj);
        System.out.println("Unboxed value: " + newNum);
        System.out.println("String value: " + str);
    }
}
