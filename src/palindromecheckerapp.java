/**
 * =========================================================
 *  MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program reverses a string using a loop and checks whether
 * the reversed string matches the original string.
 */

public class palindromecheckerapp{

    /**
     * Application entry point
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";


        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }


        boolean isPalindrome = input.equals(reversed);


        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}