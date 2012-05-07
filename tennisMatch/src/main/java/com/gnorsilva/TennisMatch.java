package com.gnorsilva;

import static com.gnorsilva.Points.*;

class TennisMatch {

    private final Player player1;
    private final Player player2;

    public TennisMatch(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void nextPointWonBy(Player winningPlayer) {
        Player losingPlayer = getLosingPlayer(winningPlayer);
        Points winnerOldPoints = winningPlayer.points();
        Points looserOldPoints = losingPlayer.points();
        Points winnerNextScore = getNextPoints(winnerOldPoints, looserOldPoints);
        winningPlayer.setPoints(winnerNextScore);
        setLosingPlayerPoints(losingPlayer, looserOldPoints, winnerNextScore);


        if (winnerNextScore == ZERO) {
            winningPlayer.setGames(winningPlayer.games().next());
        }
    }

    private Player getLosingPlayer(Player winningPlayer) {
        if (player1 == winningPlayer) {
            return player2;
        } else {
            return player1;
        }
    }

    private Points getNextPoints(Points winnerOldScore, Points looserOldScore) {
        Points points;
        if (looserOldScore == ADVANTAGE) {
            points = FORTY;
        } else if (winnerOldScore == FORTY && looserOldScore != FORTY) {
            points = ZERO;
        } else {
            points = winnerOldScore.next();
        }
        return points;
    }

    private void setLosingPlayerPoints(Player losingPlayer, Points looserOldScore, Points winnerNextScore) {
        if (winnerNextScore == ZERO) {
            losingPlayer.setPoints(ZERO);
        } else if (looserOldScore == ADVANTAGE) {
            losingPlayer.setPoints(FORTY);
        }
    }
}
