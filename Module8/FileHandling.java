import java.io.*;  // Importing the file I/O classes so we can work with files

public class FileHandling {
    public static void main(String[] args) {
        // 1. Creating a 'File' object to check if a file named "example.txt" exists
        File file = new File("example.txt");

        // Check if the file already exists. If it doesn't, create it
        try {
            if (!file.exists()) {  // If the file doesn't exist...
                file.createNewFile();  // ...create a new file
                System.out.println("File created: " + file.getName());  // Let us know the file was created
            } else {
                System.out.println("File already exists.");  // If it exists, say so
            }

            // 2. Writing text to the file using FileWriter
            // FileWriter is a way to write plain text into a file.
            try (FileWriter writer = new FileWriter("example.txt")) {
                writer.write("Hello, this is a test file for all file operations in Java.");  // Write a line of text
                writer.write("\nThis file demonstrates reading and writing text and binary data.");  // Write another line
                System.out.println("Text written to the file using FileWriter.");  // Let us know the text was written
            } catch (IOException e) {
                System.out.println("An error occurred while writing text to the file: " + e.getMessage());
            }

            // 3. Reading text from the file using FileReader
            // FileReader is used to read the text content from a file.
            try (FileReader reader = new FileReader("example.txt")) {
                int i;
                System.out.println("\nReading file content using FileReader:");
                while ((i = reader.read()) != -1) {  // Keep reading until the end of the file
                    System.out.print((char) i);  // Print each character from the file
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file using FileReader: " + e.getMessage());
            }

            // 4. Using BufferedWriter to write more efficiently
            // BufferedWriter helps write text more efficiently, especially for larger files.
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example.txt", true))) {
                bufferedWriter.newLine();  // Adds a new line (so the next text goes on the next line)
                bufferedWriter.write("This is an additional line added using BufferedWriter.");  // Write an extra line
                System.out.println("\nText written to the file using BufferedWriter.");  // Let us know we wrote text
            } catch (IOException e) {
                System.out.println("An error occurred while writing using BufferedWriter: " + e.getMessage());
            }

            // 5. Reading text from the file using BufferedReader
            // BufferedReader is faster for reading text, especially when reading large files.
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))) {
                String line;
                System.out.println("\nReading file content using BufferedReader:");
                while ((line = bufferedReader.readLine()) != null) {  // Read line by line
                    System.out.println(line);  // Print each line to the console
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file using BufferedReader: " + e.getMessage());
            }

            // 6. Writing binary data to the file using FileOutputStream
            // FileOutputStream writes raw binary data (like images or files that are not plain text).
            try (FileOutputStream fileOutputStream = new FileOutputStream("binary_example.dat")) {
                byte[] binaryData = { 65, 66, 67, 68, 69 };  // ASCII codes for 'A', 'B', 'C', 'D', 'E'
                fileOutputStream.write(binaryData);  // Write the binary data to the file
                System.out.println("\nBinary data written to the file using FileOutputStream.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing binary data: " + e.getMessage());
            }

            // 7. Reading binary data from the file using FileInputStream
            // FileInputStream is used to read raw binary data from files.
            try (FileInputStream fileInputStream = new FileInputStream("binary_example.dat")) {
                int i;
                System.out.println("\nReading binary data using FileInputStream:");
                while ((i = fileInputStream.read()) != -1) {  // Read each byte one by one
                    System.out.print((char) i);  // Convert the byte to a character and print it
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading binary data: " + e.getMessage());
            }

        } catch (IOException e) {
            // If there's any problem creating the file in the first step, print an error message
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
