package session_5_assignment.assigment_problems;

public class FantasyLeagueAutoDraftRankingEngine {

    public static boolean isDraftable(int matchesPlayed) {
        return Player.isDraftable(matchesPlayed);
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return Player.isDraftable(matchesPlayed, injured);
    }

    public static String draftAndRank(Player[] players) {
        return Player.draftAndRank(players);
    }

    public static void main(String[] args) {
        // Test Case
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(players));
    }
}
