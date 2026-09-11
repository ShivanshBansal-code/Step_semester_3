package session_1_assignment.class_problems;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return '\0';
        }

        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 256) {
                frequency[c]++;
            }
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 256 && frequency[c] == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void checkAndPrintFirstNonRepeating(String text) {
        char result = findFirstNonRepeatingChar(text);
        if (result != '\0') {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        checkAndPrintFirstNonRepeating("swiss");

        // Test Case 2
        checkAndPrintFirstNonRepeating("aabbcc");
    }
}
