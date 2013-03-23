package com.gnorsilva;

import static com.gnorsilva.Games.*;

public class PlayersNextGameScore {
    private final Player winner;
    private final Player loser;

    public PlayersNextGameScore(Player winner, Player loser) {
        this.winner = winner;
        this.loser = loser;
    }

    void set() {
        if (winnerWinsTheGame()) {
            winner.setGames(ZERO);
            loser.setGames(ZERO);
        } else {
            winner.setGames(winner.games().next());
        }
    }

    boolean winnerWinsTheGame() {
        return winner.games() == FIVE && loser.games().ordinal() < 5 || winner.games() == SIX;
    }
}