public class ArrayString {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        String name = "Alice";

        // Loop through the array and print each value
        System.out.println("Array values:");

        ///Start Counting from 0 to end element 
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



       System.out.println("-----------String Operation---------------");
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));



    }
}
