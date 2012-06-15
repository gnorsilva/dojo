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
        new PlayersNextPoints(winningPlayer, losingPlayer).set();
        if (aGameHasBeenWon()) {
            new PlayersNextGameScore(winningPlayer, losingPlayer).set();
        }
    }

    private Player getLosingPlayer(Player winningPlayer) {
        if (player1 == winningPlayer) {
            return player2;
        } else {
            return player1;
        }
    }

    private boolean aGameHasBeenWon() {
        return player1.points() == ZERO && player2.points() == ZERO;
    }

}
