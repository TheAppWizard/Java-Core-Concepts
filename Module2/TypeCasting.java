public class TypeCasting {
    public static void main(String[] args) {


        System.out.println("-------------Automatic Casting------------------");
        //Think of it as pouring water (int) into a bigger bottle (double) — it fits easily.
        int aInt = 10;
        double aDouble = aInt;  // int is automatically converted to double

        System.out.println("Integer value: " + aInt);
        System.out.println("Double value: " + aDouble);



        System.out.println("-------------Manual Casting------------------");
        //Think of this like pouring a large drink (double) into a small glass (int) — some may spill (decimal part is lost).
        double mDouble = 9.78;
        int mInt = (int) mDouble;  // manual casting: double to int

        System.out.println("Double value: " + mDouble);
        System.out.println("Integer value (after casting): " + mInt);


    }
}