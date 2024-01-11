public class Calculator {
    public static void main(String[] args) {
        // Checking if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }
        
        // Parsing command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        // Calculating sum, difference, product, quotient, and remainder
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
