// This is the main class named Pattern
public class Pattern {
    
    // The main method is where the program starts running
    public static void main(String[] args) {
        
        // We are going to print 7 rows of stars
        int rows = 7;

        // This loop controls the number of rows (1 to 7)
        for(int i = 1; i <= rows; i++) {

            // This inner loop prints stars in each row
            // It prints as many stars as the row number (e.g., 3 stars on row 3)
            for(int j = 1; j <= i; j++) {

                // Print a star (*) followed by the column number in brackets (e.g., *(1))
                // The "  " adds extra space so it looks neat
                System.out.print("*" + "(" + j + ")" + "  ");
            }

            // After finishing one row of stars, move to the next line
            System.out.println();
        }
    }
}
