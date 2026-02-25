interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
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
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.isPalindrome(input);
    }
}

public class palindromecheckerapp {
    public static void main(String[] args) {

        String input = "madam";

        PalindromeContext context = new PalindromeContext(new StackStrategy());
        boolean result1 = context.execute(input);

        context.setStrategy(new DequeStrategy());
        boolean result2 = context.execute(input);

        System.out.println("Input text: " + input);
        System.out.println("Stack Strategy Result: " + result1);
        System.out.println("Deque Strategy Result: " + result2);
    }
}