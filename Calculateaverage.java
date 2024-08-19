public class Calculateaverage {
    public static void main(String[] args) {
        int[] array = { 5, 10, 15, 20, 25 };
        
        double average = calculateAverage(array);
        
        System.out.println("Average of the array: " + average);
    }
    
    // Method to calculate average of elements in an integer array
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = (double) sum / arr.length;
        return average;
    }
}
