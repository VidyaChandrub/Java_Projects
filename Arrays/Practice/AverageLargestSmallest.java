public class AverageLargestSmallest {
    public static double findAverage(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Find the minimum and maximum values in the array
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // Calculate the average of the minimum and maximum values
        return (min + max) / 2.0;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, 2};
        System.out.println("Average: " + findAverage(arr1)); // Output: 2.5
        
        int[] arr2 = {1, 4, 3, 4};
        System.out.println("Average: " + findAverage(arr2)); // Output: 3.0
    }
}