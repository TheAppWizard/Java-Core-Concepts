public class ThisKeyword {
    String name;

    // Constructor with a parameter
    ThisKeyword(String name) {
        this.name = name; // 'this.name' means the instance variable, 'name' is the parameter // avoid confusion
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword("John");
        obj.display();
    }
}
