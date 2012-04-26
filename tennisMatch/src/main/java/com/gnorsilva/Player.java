package com.gnorsilva;

import static com.gnorsilva.TennisMatch.GameScore;

class Player {
    private GameScore score = GameScore.ZERO;

    public GameScore score() {
        return score;
    }

    public void setGameScore(GameScore score) {
        this.score = score;
    }
}
