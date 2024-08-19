import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the year is a leap year
        boolean isLeapYear = false;

        // Leap year logic
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If year is divisible by 100, check if it's also divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                // If year is not divisible by 100, it's a leap year
                isLeapYear = true;
            }
        }

        // Output
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}