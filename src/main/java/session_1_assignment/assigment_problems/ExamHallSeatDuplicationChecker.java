package session_1_assignment.assigment_problems;

public class ExamHallSeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        boolean foundDuplicate = false;
        boolean[] alreadyReported = new boolean[seatNumbers.length];

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) {
                continue;
            }

            boolean isDuplicate = false;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    isDuplicate = true;
                    alreadyReported[j] = true;
                }
            }

            if (isDuplicate) {
                foundDuplicate = true;
                System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] input1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(input1);

        // Test Case 2
        int[] input2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(input2);
    }
}
