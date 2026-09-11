package session_1_assignment.assigment_problems;

public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signals recorded.");
            return;
        }

        char maxChar = signalLog.charAt(0);
        int maxLength = 1;

        char currentChar = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentLength++;
            } else {
                currentChar = signalLog.charAt(i);
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxLength + " times");
    }

    public static void main(String[] args) {
        // Test Case 1
        findLongestStreak("RRGGGYRR");

        // Test Case 2
        findLongestStreak("RRRRYYGG");
    }
}
