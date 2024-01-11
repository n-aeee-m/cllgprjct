import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeVowels(input);
        
        System.out.println("String after removing vowels: " + result);
        
        scanner.close();
    }
    
    public static String removeVowels(String input) {
        // Using regular expression to remove vowels (case-insensitive)
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}
