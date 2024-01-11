import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of rows and columns of the matrix
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input elements for the matrix
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        printMatrix(matrix);

        int trace = calculateTrace(matrix);
        System.out.println("\nTrace of the matrix: " + trace);

        int[][] transposeMatrix = calculateTranspose(matrix);
        System.out.println("\nTranspose of the matrix:");
        printMatrix(transposeMatrix);

        scanner.close();
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate the trace of the matrix
    public static int calculateTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    // Method to calculate the transpose of the matrix
    public static int[][] calculateTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
