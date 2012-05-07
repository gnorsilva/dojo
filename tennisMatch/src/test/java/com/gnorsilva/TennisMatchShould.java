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
    public void set_mcEnroe_points_to_be_fifteen_when_winning_one_point() throws Exception {
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(FIFTEEN));
        assertThat(bjornBorg.points(), is(ZERO));
    }

    @Test
    public void set_both_players_points_to_be_fifteen_when_they_each_win_one_point() throws Exception {
        match.nextPointWonBy(mcEnroe);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.points(), is(FIFTEEN));
        assertThat(bjornBorg.points(), is(FIFTEEN));
    }

    @Test
    public void set_mcEnroe_points_to_be_thirty_when_winning_two_points() throws Exception {
        mcEnroe.setPoints(FIFTEEN);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(THIRTY));
        assertThat(bjornBorg.points(), is(ZERO));
    }

    @Test
    public void set_both_players_points_to_be_thirty_when_they_each_win_two_points() throws Exception {
        mcEnroe.setPoints(FIFTEEN);
        match.nextPointWonBy(mcEnroe);
        bjornBorg.setPoints(FIFTEEN);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.points(), is(THIRTY));
        assertThat(bjornBorg.points(), is(THIRTY));
    }

    @Test
    public void set_mcEnroe_points_to_be_forty_when_winning_three_points() throws Exception {
        mcEnroe.setPoints(THIRTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(FORTY));
        assertThat(bjornBorg.points(), is(ZERO));
    }

    @Test
    public void set_both_players_points_to_be_forty_when_they_each_win_three_points() throws Exception {
        mcEnroe.setPoints(THIRTY);
        bjornBorg.setPoints(THIRTY);
        match.nextPointWonBy(mcEnroe);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.points(), is(FORTY));
        assertThat(bjornBorg.points(), is(FORTY));
    }

    @Test
    public void set_mcEnroe_points_to_be_advantage_when_winning_the_next_point_and_players_are_in_deuce() throws Exception {
        mcEnroe.setPoints(FORTY);
        bjornBorg.setPoints(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(ADVANTAGE));
    }

    @Test
    public void set_borg_points_to_be_forty_when_winning_the_next_point_and_mcEnroe_had_advantage() throws Exception {
        mcEnroe.setPoints(ADVANTAGE);
        bjornBorg.setPoints(FORTY);
        match.nextPointWonBy(bjornBorg);
        assertThat(bjornBorg.points(), is(FORTY));
    }

    @Test
    public void set_both_players_points_to_be_forty_when_bjorg_wins_the_next_point_and_mcEnroe_had_advantage() throws Exception {
        mcEnroe.setPoints(ADVANTAGE);
        bjornBorg.setPoints(FORTY);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.points(), is(FORTY));
        assertThat(bjornBorg.points(), is(FORTY));
    }

    @Test
    public void set_both_players_points_to_be_forty_when_mcEnroe_wins_the_next_point_and_bjorg_had_advantage() throws Exception {
        bjornBorg.setPoints(ADVANTAGE);
        mcEnroe.setPoints(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(FORTY));
        assertThat(bjornBorg.points(), is(FORTY));
    }

    @Test
    public void set_both_players_points_to_be_zero_when_mcEnroe_is_in_advantage_and_wins_the_next_point() throws Exception {
        mcEnroe.setPoints(ADVANTAGE);
        bjornBorg.setPoints(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(ZERO));
        assertThat(bjornBorg.points(), is(ZERO));
    }

    @Test
    public void set_both_players_points_to_be_zero_when_mcEnroe_has_forty_points_and_wins_the_next_point() throws Exception {
        mcEnroe.setPoints(FORTY);
        bjornBorg.setPoints(ZERO);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.points(), is(ZERO));
        assertThat(bjornBorg.points(), is(ZERO));
    }

    @Test
    public void start_a_match_with_both_players_at_zero_games() {
        assertThat(mcEnroe.games(), is(Games.ZERO));
        assertThat(bjornBorg.games(), is(Games.ZERO));
    }

    @Test
    public void increase_mcEnroes_game_score_by_one_when_he_wins_a_game() throws Exception {
        mcEnroe.setGames(Games.ZERO);
        mcEnroe.setPoints(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.games(), is(Games.ONE));
    }

}
