import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Method to calculate HCF (GCD) using Euclidean algorithm
    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Method to calculate LCM using the formula: LCM = (num1 * num2) / HCF
    public static int calculateLCM(int num1, int num2) {
        int hcf = calculateHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
}
