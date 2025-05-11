//House Example

/// private — only people inside the room (class) can use it.
//  default — anyone in the same building (package) can use it.
// protected — people in this building or children of this family elsewhere (subclasses) can use it.
// public — anyone in the world can access it.

public class AccessModifiers {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public void showAccess() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }

    // ✅ Add main method here
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.showAccess();
    }
}



