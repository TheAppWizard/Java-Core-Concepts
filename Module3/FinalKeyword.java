//final Variable: The value of the variable cannot be changed after it is initialized.
//final Method: The method cannot be overridden by any subclass.
//final Class: The class cannot be inherited or extended by any subclass.


// Final class: cannot be extended
final class Constants {
    // Final variable: value cannot be changed once assigned
    final int MAX_SPEED = 120;

    // Final method: cannot be overridden
    final void showSpeed() {
        System.out.println("Max speed is: " + MAX_SPEED);
    }
}

// Trying to extend the final class will cause an error
// class Car extends Constants {}  // ❌ This will give a compile-time error

public class FinalKeyword {
    public static void main(String[] args) {
        Constants car = new Constants();
        car.showSpeed();

        // Trying to change final variable will cause an error
        // car.MAX_SPEED = 150;  // ❌ This will also give a compile-time error
    }
}

