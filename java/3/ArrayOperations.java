import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array (10 or more): ");
        int size = scanner.nextInt();

        if (size < 10) {
            System.out.println("Please enter an array size of 10 or more.");
            return;
        }

        int[] numbers = new int[size];

        // Input elements for the array
        System.out.println("Enter " + size + " numbers for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int smallest = findSmallestElement(numbers);
        int largest = findLargestElement(numbers);
        int secondLargest = findSecondLargestElement(numbers);

        System.out.println("Smallest element in the array: " + smallest);
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Second largest element in the array: " + secondLargest);

        scanner.close();
    }

    // Method to find the smallest element in the array
    public static int findSmallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // Method to find the largest element in the array
    public static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // Method to find the second largest element in the array
    public static int findSecondLargestElement(int[] arr) {
        Arrays.sort(arr); // Sort the array
        int n = arr.length;

        // Find the second largest element
        int secondLargest = arr[n - 2];
        return secondLargest;
    }
}
