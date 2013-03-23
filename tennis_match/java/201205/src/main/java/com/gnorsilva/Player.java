package com.gnorsilva;

class Player {

    private Points points = Points.ZERO;
    private Games games = Games.ZERO;

    public void setPoints(Points points) {
        this.points = points;
    }

    public Points points() {
        return points;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public Games games() {
        return games;
    }
}
