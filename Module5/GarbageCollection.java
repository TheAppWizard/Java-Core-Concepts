public class GarbageCollection {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // After using the object, explicitly call cleanup
        obj.cleanup();
        
        obj = null;  // Make the object eligible for GC
        
        System.gc();
    }
}

class MyClass {
    public void cleanup() {
        System.out.println("Cleaning up resources.");
    }
}



//Imagine your program is like a house. As you use things (like creating objects), 
//you leave stuff around the house. Over time, it gets messy. The JVM (Java Virtual Machine) 
//has a built-in cleaning crew called the Garbage Collector, which picks up stuff (objects) you’re no longer using.