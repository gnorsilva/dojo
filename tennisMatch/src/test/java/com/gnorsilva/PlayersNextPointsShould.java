package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.Points.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayersNextPointsShould {

    Player winner = new Player();
    Player loser = new Player();
    public final PlayersNextPoints playersNextPoints = new PlayersNextPoints(winner, loser);

    @Test
    public void set_a_winning_players_points_to_FIFTEEN_when_he_previously_had_ZERO() throws Exception {
        winner.setPoints(ZERO);
        playersNextPoints.set();
        assertThat(winner.points(), is(FIFTEEN));
    }

    @Test
    public void set_a_winning_players_points_to_THIRTY_when_he_previously_had_FIFTEEN() throws Exception {
        winner.setPoints(FIFTEEN);
        playersNextPoints.set();
        assertThat(winner.points(), is(THIRTY));
    }

    @Test
    public void set_a_winning_players_points_to_FORTY_when_he_previously_had_THIRTY() throws Exception {
        winner.setPoints(THIRTY);
        playersNextPoints.set();
        assertThat(winner.points(), is(FORTY));
    }

    @Test
    public void set_a_winning_players_points_to_ZERO_when_he_previously_had_FORTY_and_the_loser_had_less_than_FORTY() throws Exception {
        winner.setPoints(FORTY);
        loser.setPoints(THIRTY);
        playersNextPoints.set();
        assertThat(winner.points(), is(ZERO));
    }

}
