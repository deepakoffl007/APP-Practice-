import java.util.Scanner;

public class FirstNonRepeating {

    static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char result = firstNonRepeating(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
