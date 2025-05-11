// ✅ What are Operators?
// Operators are special symbols used to perform operations on variables and values.

// 📌 Types of Operators Used

//  Arithmetic Operators
// - `+`, `-`, `*`, `/`, `%`
// Example: `a + b` adds two numbers.

// 2. Relational (Comparison) Operators
// `==`, `!=`, `<`, `>`, `<=`, `>=`
// Example: `a == b` checks if `a` is equal to `b`.

// 3. Logical Operators
// `&&` (AND), `||` (OR), `!` (NOT)
// Used to combine boolean expressions.

// 4. Unary Operators
// `++`, `--` (increment/decrement)
// Example: `++x` increases `x` by 1 before using it.

// 5. Assignment Operators
//`=`, `+=`, `-=`, `*=`, `/=`
// Example: `x += 5` is the same as `x = x + 5`.


public class OperatorsExpressions {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational Operators
        boolean isEqual = a == b;
        boolean isGreater = a > b;

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        boolean andResult = condition1 && condition2;
        boolean orResult = condition1 || condition2;

        // Unary Operators
        int x = 5;
        int y = ++x;  // pre-increment

        // Assignment Operators
        int number = 10;
        number += 5;  // same as number = number + 5;

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Pre-incremented x: " + y);
        System.out.println("After += operator: " + number);
    }
}
