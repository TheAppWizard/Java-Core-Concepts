
//🔹 What is it?
// Defining **multiple methods with the same name** but different parameters (number or type).
// Helps make your code clean and organized.

// ✅ Example:

// java
// showInfo(String name)       // one string
// showInfo(String name, int age)  // string and int
// showInfo(int age)          // just an int


public class MethodOverloading {

    // Method with one parameter
    void showInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method with two parameters
    void showInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method with different type of parameters
    void showInfo(int age) {
        System.out.println("Only Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.showInfo("Alice");
        obj.showInfo("Bob", 25);
        obj.showInfo(30);
    }
}
