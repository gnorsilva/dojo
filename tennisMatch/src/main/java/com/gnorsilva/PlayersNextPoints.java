package com.gnorsilva;

import static com.gnorsilva.Points.*;

public class PlayersNextPoints {

    private final Player pointWinner;
    private final Player pointLooser;

    public PlayersNextPoints(Player pointWinner, Player pointLooser) {
        this.pointWinner = pointWinner;
        this.pointLooser = pointLooser;
    }

    public void set() {
        Points winnerOldPoints = pointWinner.points();
        Points loserOldPoints = pointLooser.points();

        Points winnerNextPoints = getWinnerNextPoints(winnerOldPoints, loserOldPoints);
        pointWinner.setPoints(winnerNextPoints);

        Points looserNextPoints = getLooserNextPoints(loserOldPoints, winnerNextPoints);
        pointLooser.setPoints(looserNextPoints);
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
}