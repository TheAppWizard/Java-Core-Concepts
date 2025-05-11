public class BoxUnbox {
    public static void main(String[] args) {

        // --------- Boxing ---------
        // We have a primitive int value
        int number = 100;

        // Java automatically converts (boxes) the int into an Integer object
        Integer boxedNumber = number;  // This is autoboxing
        System.out.println("Autoboxed value (int to Integer): " + boxedNumber);


        // --------- Unboxing ---------
        // We have an Integer object
        Integer myObject = 200;

        // Java automatically converts (unboxes) it back into a primitive int
        int unboxedNumber = myObject;  // This is unboxing
        System.out.println("Unboxed value (Integer to int): " + unboxedNumber);
    }
}
