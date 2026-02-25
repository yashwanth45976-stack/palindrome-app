public class palindromecheckerapp {

    public static boolean twoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    public static boolean stackMethod(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        long start1 = System.nanoTime();
        boolean r1 = twoPointer(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = reverseString(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean r3 = stackMethod(input);
        long end3 = System.nanoTime();

        System.out.println("Input text: " + input);
        System.out.println("Two Pointer Result: " + r1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Reverse String Result: " + r2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method Result: " + r3 + " Time: " + (end3 - start3) + " ns");
    }
}