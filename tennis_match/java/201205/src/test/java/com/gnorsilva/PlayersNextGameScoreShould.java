package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.Games.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayersNextGameScoreShould {

    private Player winner = new Player();
    private Player loser = new Player();
    private PlayersNextGameScore playersNextGameScore = new PlayersNextGameScore(winner, loser);

    @Test
    public void increase_a_winning_player_game_score_by_one() throws Exception {
        winner.setGames(TWO);
        playersNextGameScore.set();
        assertThat(winner.games(), is(THREE));
    }

    @Test
    public void set_a_player_game_score_to_ZERO_when_winning_the_set_by_his_6th_game() throws Exception {
        winner.setGames(FIVE);
        playersNextGameScore.set();
        assertThat(winner.games(), is(ZERO));
    }

    @Test
    public void set_a_players_game_score_to_ZERO_when_he_loses_the_set() throws Exception {
        winner.setGames(FIVE);
        loser.setGames(FOUR);
        playersNextGameScore.set();
        assertThat(loser.games(), is(ZERO));
    }

    @Test
    public void set_a_players_game_score_to_SIX_when_winning_his_6th_game_and_the_other_player_has_a_game_score_of_5() throws Exception {
        winner.setGames(FIVE);
        loser.setGames(FIVE);
        playersNextGameScore.set();
        assertThat(winner.games(), is(SIX));
    }

    @Test
    public void set_a_players_game_score_to_SIX_when_winning_his_6th_game_and_the_other_player_has_a_game_score_of_6() throws Exception {
        winner.setGames(FIVE);
        loser.setGames(SIX);
        playersNextGameScore.set();
        assertThat(winner.games(), is(SIX));
    }

    @Test
    public void set_a_players_game_score_to_ZERO_when_winning_his_7th_game_and_the_other_player_has_a_game_score_of_5() throws Exception {
        winner.setGames(SIX);
        loser.setGames(FIVE);
        playersNextGameScore.set();
        assertThat(winner.games(), is(ZERO));
    }

    @Test
    public void set_a_players_game_score_to_ZERO_when_winning_his_7th_game_and_the_other_player_has_a_game_score_of_6() throws Exception {
        winner.setGames(SIX);
        loser.setGames(SIX);
        playersNextGameScore.set();
        assertThat(winner.games(), is(ZERO));
    }

}
