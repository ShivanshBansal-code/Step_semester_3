package session_5_assignment.assigment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements Comparable<Player> {
    public String name;
    public int matchesPlayed;
    public double battingAverage;
    public boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        if (isDraftable(matchesPlayed)) {
            return true;
        }
        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    public static String draftAndRank(Player[] players) {
        if (players == null || players.length == 0) {
            return "";
        }

        List<Player> draftableList = new ArrayList<>();
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed, p.injured)) {
                draftableList.add(p);
            }
        }

        Player[] draftableArray = draftableList.toArray(new Player[0]);
        Arrays.sort(draftableArray);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftableArray.length; i++) {
            sb.append(i + 1).append(". ").append(draftableArray[i].name);
            if (i < draftableArray.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }
}
