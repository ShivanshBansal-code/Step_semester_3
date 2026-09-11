package session_1_assignment.assigment_problems;

import java.util.Locale;

public class TypingSpeedTestAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input: Strings cannot be null.");
            return;
        }

        int total = original.length();
        int matched = 0;
        int firstMismatchPosition = -1;
        char originalMismatchChar = ' ';
        char typedMismatchChar = ' ';

        int minLen = Math.min(original.length(), typed.length());

        for (int i = 0; i < minLen; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {
                if (firstMismatchPosition == -1) {
                    firstMismatchPosition = i + 1;
                    originalMismatchChar = original.charAt(i);
                    typedMismatchChar = typed.charAt(i);
                }
            }
        }

        double accuracy = total > 0 ? ((double) matched / total) * 100.0 : 0.0;

        if (firstMismatchPosition != -1) {
            System.out.printf(Locale.US, "Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, firstMismatchPosition, originalMismatchChar, typedMismatchChar);
        } else {
            System.out.printf(Locale.US, "Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, total, accuracy);
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        checkTypingAccuracy("hello world", "hello worlt");

        // Test Case 2
        checkTypingAccuracy("coding", "coding");
    }
}
