import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Binary: " + convertToBinary(number));
        System.out.println("Octal: " + convertToOctal(number));
        System.out.println("Hexadecimal: " + convertToHexadecimal(number));

        scanner.close();
    }

    public static String convertToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static String convertToOctal(int number) {
        return Integer.toOctalString(number);
    }

    public static String convertToHexadecimal(int number) {
        return Integer.toHexString(number);
    }
}
