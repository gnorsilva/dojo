package com.gnorsilva;

class Player {
    private GamePoint score = GamePoint.ZERO;

    public GamePoint score() {
        return score;
    }

    public void setGameScore(GamePoint score) {
        this.score = score;
    }
}
