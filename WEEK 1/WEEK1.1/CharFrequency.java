import java.util.Scanner;

public class CharFrequency {

    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static Object[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = getLength(text);

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        Object[][] result = new Object[len][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = c;
                result[index][1] = freq[c];
                freq[c] = 0;
                index++;
            }
        }

        Object[][] finalResult = new Object[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Object[][] freqArray = findFrequency(text);
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println(freqArray[i][0] + " -> " + freqArray[i][1]);
        }
    }
}
