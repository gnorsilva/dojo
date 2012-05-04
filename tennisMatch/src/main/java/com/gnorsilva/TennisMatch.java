package com.gnorsilva;

import static com.gnorsilva.TennisMatch.GameScore.*;

class TennisMatch {

    static enum GameScore {
        ZERO,FIFTEEN,THIRTY,FORTY,ADVANTAGE;
    }

    private final Player player1;
    private final Player player2;

    public TennisMatch(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void nextPointWonBy(Player winningPlayer) {
        GameScore winnerOldScore = winningPlayer.score();
        Player losingPlayer = getLosingPlayer(winningPlayer);
        GameScore looserOldScore = losingPlayer.score();
        GameScore winnerNextScore = getNextGameScore(winnerOldScore, looserOldScore);
        winningPlayer.setGameScore(winnerNextScore);
        if (looserOldScore == ADVANTAGE) {
            losingPlayer.setGameScore(FORTY);
        }
    }

    private Player getLosingPlayer(Player winningPlayer) {
        return player1 == winningPlayer ? player2 : player1;
    }

    private GameScore getNextGameScore(GameScore winnerOldScore, GameScore looserOldScore) {
        GameScore nextScore;
        if (winnerOldScore == FIFTEEN) {
            nextScore = THIRTY;
        }else if (winnerOldScore == THIRTY || looserOldScore == ADVANTAGE) {
            nextScore = FORTY;
        } else if (winnerOldScore == FORTY) {
            nextScore = ADVANTAGE;
        } else {
            nextScore = FIFTEEN;
        }
        return nextScore;
    }
}
