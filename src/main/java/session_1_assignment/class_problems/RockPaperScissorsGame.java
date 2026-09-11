package session_1_assignment.class_problems;

import java.util.Locale;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        // Predefined list of 5 rounds for live demo
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Scissors"};
        String[] computerMoves = {"Scissors", "Paper", "Rock", "Paper", "Paper"};

        int wins = 0;
        int losses = 0;
        int draws = 0;
        int totalRounds = playerMoves.length;

        for (int i = 0; i < totalRounds; i++) {
            String pMove = playerMoves[i];
            String cMove = computerMoves[i];
            String result = playRound(pMove, cMove);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println("Round " + (i + 1) + " \u2014 Player: " + pMove + ", Computer: " + cMove + " -> " + result);
        }

        double winPercentage = totalRounds > 0 ? ((double) wins / totalRounds) * 100.0 : 0.0;

        System.out.printf(Locale.US, "Final Summary (after %d rounds) Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                totalRounds, wins, losses, draws, winPercentage);
    }
}
