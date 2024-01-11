import java.util.Arrays;
import java.util.Scanner;

public class MergeArraysInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input for the size of the second array
        System.out.print("\nEnter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("\nMerged Array: " + Arrays.toString(mergedArray));

        scanner.close();
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];

        int index = 0;

        for (int element : array1) {
            mergedArray[index] = element;
            index++;
        }

        for (int element : array2) {
            mergedArray[index] = element;
            index++;
        }

        return mergedArray;
    }
}
