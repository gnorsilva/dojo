package com.gnorsilva;

import static com.gnorsilva.GamePoint.*;

class TennisMatch {

    private final Player player1;
    private final Player player2;

    public TennisMatch(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void nextPointWonBy(Player winningPlayer) {
        GamePoint winnerOldScore = winningPlayer.score();
        Player losingPlayer = getLosingPlayer(winningPlayer);
        GamePoint looserOldScore = losingPlayer.score();
        GamePoint winnerNextScore = getNextGameScore(winnerOldScore, looserOldScore);
        winningPlayer.setGameScore(winnerNextScore);
        if (looserOldScore == ADVANTAGE) {
            losingPlayer.setGameScore(FORTY);
        }
    }

    private Player getLosingPlayer(Player winningPlayer) {
        return player1 == winningPlayer ? player2 : player1;
    }

    private GamePoint getNextGameScore(GamePoint winnerOldScore, GamePoint looserOldScore) {
        GamePoint nextScore;
        if (looserOldScore == ADVANTAGE) {
            nextScore = FORTY;
        } else {
            nextScore = winnerOldScore.nextPoint();
        }
        return nextScore;
    }
}
