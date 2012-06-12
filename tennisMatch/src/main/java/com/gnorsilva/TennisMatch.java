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
        setNextPointsScore(winningPlayer, losingPlayer);
        if (aGameHasBeenWon()) {
            calculateNextGameScore(winningPlayer);
        }
    }

    private Player getLosingPlayer(Player winningPlayer) {
        if (player1 == winningPlayer) {
            return player2;
        } else {
            return player1;
        }
    }

    private void setNextPointsScore(Player winner, Player loser) {
        Points winnerOldPoints = winner.points();
        Points loserOldPoints = loser.points();

        Points winnerNextPoints = getWinnerNextPoints(winnerOldPoints, loserOldPoints);
        winner.setPoints(winnerNextPoints);

        Points looserNextPoints = getLooserNextPoints(loserOldPoints, winnerNextPoints);
        loser.setPoints(looserNextPoints);
    }

    private Points getWinnerNextPoints(Points winnerOldPoints, Points looserOldPoints) {
        Points points;
        if (looserOldPoints == ADVANTAGE) {
            points = FORTY;
        } else if (winnerOldPoints == FORTY && looserOldPoints != FORTY) {
            points = ZERO;
        } else {
            points = winnerOldPoints.next();
        }
        return points;
    }

    private Points getLooserNextPoints(Points looserOldPoints, Points winnerPoints) {
        Points points;
        if (winnerPoints == ZERO) {
            points = ZERO;
        } else if (looserOldPoints == ADVANTAGE) {
            points = FORTY;
        } else {
            points = looserOldPoints;
        }
        return points;
    }

    private boolean aGameHasBeenWon() {
        return player1.points() == ZERO && player2.points() == ZERO;
    }

    private void calculateNextGameScore(Player winningPlayer) {
        winningPlayer.setGames(winningPlayer.games().next());
    }
}
