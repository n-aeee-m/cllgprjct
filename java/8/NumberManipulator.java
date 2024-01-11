import java.util.Scanner;

class NumberManipulator {
    private int number;

    public NumberManipulator(int num) {
        this.number = num;
    }

    public int calculateSumOfDigits() {
        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }

        return sum;
    }

    public int calculateReverse() {
        int reversedNumber = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        NumberManipulator numberManipulator = new NumberManipulator(inputNumber);

        int sumOfDigits = numberManipulator.calculateSumOfDigits();
        System.out.println("Sum of digits: " + sumOfDigits);

        int reversedNumber = numberManipulator.calculateReverse();
        System.out.println("Reverse of the number: " + reversedNumber);

        scanner.close();
    }
}
