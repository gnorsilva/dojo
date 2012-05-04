package com.gnorsilva;

import org.junit.Ignore;
import org.junit.Test;

import static com.gnorsilva.GamePoint.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class TennisMatchShould {

    Player mcEnroe = new Player();
    Player bjornBorg = new Player();
    TennisMatch match = new TennisMatch(mcEnroe, bjornBorg);

    @Test
    public void set_mcEnroe_score_to_be_fifteen_when_winning_one_point() throws Exception {
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.score(), is(FIFTEEN));
        assertThat(bjornBorg.score(), is(ZERO));
    }

    @Test
    public void set_both_players_score_to_be_fifteen_when_they_each_win_one_point() throws Exception {
        match.nextPointWonBy(mcEnroe);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.score(), is(FIFTEEN));
        assertThat(bjornBorg.score(), is(FIFTEEN));
    }

    @Test
    public void set_mcEnroe_score_to_be_thirty_when_winning_two_points() throws Exception {
        mcEnroe.setGameScore(FIFTEEN);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.score(), is(THIRTY));
        assertThat(bjornBorg.score(), is(ZERO));
    }

    @Test
    public void set_both_players_score_to_be_thirty_when_they_each_win_two_points() throws Exception {
        mcEnroe.setGameScore(FIFTEEN);
        match.nextPointWonBy(mcEnroe);
        bjornBorg.setGameScore(FIFTEEN);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.score(), is(THIRTY));
        assertThat(bjornBorg.score(), is(THIRTY));
    }

    @Test
    public void set_mcEnroe_score_to_be_forty_when_winning_three_points() throws Exception {
        mcEnroe.setGameScore(THIRTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.score(), is(FORTY));
        assertThat(bjornBorg.score(), is(ZERO));
    }

    @Test
    public void set_both_players_score_to_be_forty_when_they_each_win_three_points() throws Exception {
        mcEnroe.setGameScore(THIRTY);
        bjornBorg.setGameScore(THIRTY);
        match.nextPointWonBy(mcEnroe);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.score(), is(FORTY));
        assertThat(bjornBorg.score(), is(FORTY));
    }

    @Test
    public void set_mcEnroe_score_to_be_advantage_when_winning_the_next_point_and_players_are_in_deuce() throws Exception {
        mcEnroe.setGameScore(FORTY);
        bjornBorg.setGameScore(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.score(), is(ADVANTAGE));
    }

    @Test
    public void set_borg_score_to_be_forty_when_winning_the_next_point_and_mcEnroe_had_advantage() throws Exception {
        mcEnroe.setGameScore(ADVANTAGE);
        bjornBorg.setGameScore(FORTY);
        match.nextPointWonBy(bjornBorg);
        assertThat(bjornBorg.score(), is(FORTY));
    }

    @Test
    public void set_both_players_score_to_be_forty_when_bjorg_wins_the_next_point_and_mcEnroe_had_advantage() throws Exception {
        mcEnroe.setGameScore(ADVANTAGE);
        bjornBorg.setGameScore(FORTY);
        match.nextPointWonBy(bjornBorg);
        assertThat(mcEnroe.score(), is(FORTY));
        assertThat(bjornBorg.score(), is(FORTY));
    }

    @Test
    public void set_both_players_score_to_be_forty_when_mcEnroe_wins_the_next_point_and_bjorg_had_advantage() throws Exception {
        bjornBorg.setGameScore(ADVANTAGE);
        mcEnroe.setGameScore(FORTY);
        match.nextPointWonBy(mcEnroe);
        assertThat(mcEnroe.score(), is(FORTY));
        assertThat(bjornBorg.score(), is(FORTY));
    }

    @Test
    public void set_mcEnroe_score_to_be_zero_when_mcEnroe_wins_the_next_point_to_win_the_current_game() throws Exception {
        fail("not implemented yet");
    }

}
