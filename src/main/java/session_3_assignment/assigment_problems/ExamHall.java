package session_3_assignment.assigment_problems;

public class ExamHall {
    String hallName;
    int seatsFilled;

    public static void main(String[] args) {
        ExamHall hallA = new ExamHall();
        hallA.hallName = "Block-3 Hall A";

        ExamHall hallB = new ExamHall();
        hallB.hallName = "Block-3 Hall B";

        // Increase seatsFilled for hallA only, four separate times
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        // Print both halls' seatsFilled values to show hallB was never touched
        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}
