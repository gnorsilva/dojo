package com.gnorsilva;

import org.junit.Ignore;
import org.junit.Test;

import static com.gnorsilva.Points.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class TennisMatchShould {

    Player mcEnroe = new Player();
    Player bjornBorg = new Player();
    TennisMatch match = new TennisMatch(mcEnroe, bjornBorg);

    @Test
    public void start_a_match_with_both_players_at_zero_points() {
        assertThat(mcEnroe.points(), is(ZERO));
        assertThat(bjornBorg.points(), is(ZERO));
    }

    @Test
    public void increase_a_players_points_when_he_wins_the_next_point() throws Exception {
        mcEnroe.setPoints(THIRTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(FORTY));
    }

    @Test
    public void NOT_increase_a_players_points_if_he_does_not_win_the_next_point() throws Exception {
        bjornBorg.setPoints(FIFTEEN);
        match.nextPointWonBy(mcEnroe);
        assertThat(bjornBorg.points(), is(FIFTEEN));
    }

    @Test
    public void start_a_match_with_both_players_at_zero_games() {
        assertThat(mcEnroe.games(), is(Games.ZERO));
        assertThat(bjornBorg.games(), is(Games.ZERO));
    }

    @Test
    public void increase_a_players_game_score_by_one_when_he_wins_a_game() throws Exception {
        mcEnroe.setGames(Games.THREE);
        mcEnroe.setPoints(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.games(), is(Games.FOUR));
    }

    @Test
    public void NOT_increase_a_players_game_score_by_one_when_he_loses_a_game() throws Exception {
        mcEnroe.setGames(Games.THREE);
        bjornBorg.setGames(Games.TWO);
        mcEnroe.setPoints(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(bjornBorg.games(), is(Games.TWO));
    }

    @Test
    public void NOT_increase_a_players_game_score_when_he_wins_the_first_point() throws Exception {
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.games(), is(Games.ZERO));
    }

}
