public class DownwardPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        // Loop through each row
        for (int i = rows; i >= 1; i--) {
            // Print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
