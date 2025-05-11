
// Shared Data (SharedData class):
// We have a shared object (SharedData) that contains a number (int number).
// Producer produces a number, and Consumer consumes it. They communicate via wait() and notify().
// Producer creates a random number between 0 and 100 and waits for Consumer to consume it.
// Consumer consumes the number and resets it to 0 after consumption.

// Producer Thread:
// The Producer thread continuously produces a number (5 times).
// It waits if the Consumer hasn’t consumed the previous number.
// After producing the number, it notifies the Consumer to consume it.


// Consumer Thread:
// The Consumer thread continuously consumes the number (5 times).
// It waits if the Producer hasn’t produced any number yet.
// After consuming the number, it notifies the Producer to produce more data.


// How It Works (Step by Step):
// Producer starts and produces a number (e.g., 52).
// It then notifies the Consumer that the number is ready.
// Consumer starts, waits until there’s a number, and then consumes it (e.g., prints 52).
// After consuming, Consumer notifies the Producer to produce more data.
// This continues until each thread has completed its 5 tasks.





class SharedData {
    private int number = 0;  // Shared data (the number produced)

    // Producer method to produce data
    public synchronized void produce() throws InterruptedException {
        while (number != 0) {  // If data has already been produced (i.e., number is not 0)
            wait();  // Wait until the Consumer consumes the data
        }
        number = (int) (Math.random() * 100);  // Produce a random number between 0 and 100
        System.out.println("Produced number: " + number);  // Show what number was produced
        notify();  // Notify the Consumer that the data is ready
    }

    // Consumer method to consume the data
    public synchronized void consume() throws InterruptedException {
        while (number == 0) {  // If no data has been produced (i.e., number is 0)
            wait();  // Wait until the Producer produces data
        }
        System.out.println("Consumed number: " + number);  // Consume the number (print it)
        number = 0;  // Reset the number after consuming
        notify();  // Notify the Producer to produce more data
    }
}

class Producer extends Thread {
    private final SharedData sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {  // Producer will produce 5 times
                sharedData.produce();  // Call the produce method to produce a number
                Thread.sleep(1000);  // Wait for 1 second before producing again
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {  // Consumer will consume 5 times
                sharedData.consume();  // Call the consume method to consume a number
                Thread.sleep(1500);  // Wait for 1.5 seconds before consuming again
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();  // Create a shared data object

        Producer producer = new Producer(sharedData);  // Create a Producer thread
        Consumer consumer = new Consumer(sharedData);  // Create a Consumer thread

        producer.start();  // Start the Producer thread
        consumer.start();  // Start the Consumer thread
    }
}
