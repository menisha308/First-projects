public class MyGrades {

    public static void main(String[] args) {
        // Student information
        String name = "Menisha";
        int registerNo = 97901;

        // Marks for each subject
        int ml = 82;
        int iot = 85;
        int cyberSecu = 79;
        int rLanguage = 81;
        int dbms = 79;

        // Calculate total and average
        int total = ml + iot + cyberSecu + rLanguage + dbms;
        double average = total / 5.0; // Using 5.0 to ensure floating point division

        // Determine grade based on average
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Determine result
        String result = average >= 50 ? "Pass" : "Fail";

        // Output the results
        System.out.println("Name         : " + name);
        System.out.println("Register no  : " + registerNo);
        System.out.println("Subject      : Mark");
        System.out.println("ML           : " + ml);
        System.out.println("IOT          : " + iot);
        System.out.println("Cyber Secu   : " + cyberSecu);
        System.out.println("R Language   : " + rLanguage);
        System.out.println("DBMS         : " + dbms);
        System.out.println("---------------------");
        System.out.println("Total        : " + total);
        System.out.println("Average      : " + String.format("%.2f", average));
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("---------------------");
    }
}
