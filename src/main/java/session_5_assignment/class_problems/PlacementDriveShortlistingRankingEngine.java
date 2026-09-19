package session_5_assignment.class_problems;

public class PlacementDriveShortlistingRankingEngine {

    public static boolean isEligible(double cgpa) {
        return Candidate.isEligible(cgpa);
    }

    public static boolean isEligible(double cgpa, int codingScore) {
        return Candidate.isEligible(cgpa, codingScore);
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        return Candidate.shortlistAndRank(candidates);
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
