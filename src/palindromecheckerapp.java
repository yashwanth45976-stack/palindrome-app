public class palindromecheckerapp {
    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text: " + input);
        System.out.println("Normalized text: " + normalized);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}