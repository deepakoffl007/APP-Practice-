import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static char[] reverseString(String text) {
        int len = text.length();
        char[] rev = new char[len];
        for (int i = 0; i < len; i++) {
            rev[i] = text.charAt(len - 1 - i);
        }
        return rev;
    }

    static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        if (original.length != reversed.length) return false;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Logic 1 (Iterative): " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Char Array): " + (isPalindromeCharArray(text) ? "Palindrome" : "Not Palindrome"));
    }
}
