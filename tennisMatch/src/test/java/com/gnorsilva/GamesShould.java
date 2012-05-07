package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.Games.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GamesShould {

    @Test
    public void calculate_ONE_as_the_next_game_after_ZERO() throws Exception {
        assertThat(ZERO.next(), is(ONE));
    }

    @Test
    public void calculate_TWO_as_the_next_game_after_ONE() throws Exception {
        assertThat(ONE.next(), is(TWO));
    }

    @Test
    public void calculate_THREE_as_the_next_game_after_TWO() throws Exception {
        assertThat(TWO.next(), is(THREE));
    }

    @Test
    public void calculate_FOUR_as_the_next_game_after_THREE() throws Exception {
        assertThat(THREE.next(), is(FOUR));
    }

    @Test
    public void calculate_FIVE_as_the_next_game_after_FOUR() throws Exception {
        assertThat(FOUR.next(), is(FIVE));
    }

    @Test
    public void calculate_SIX_as_the_next_game_after_FIVE() throws Exception {
        assertThat(FIVE.next(), is(SIX));
    }

    @Test
    public void calculate_SEVEN_as_the_next_game_after_SIX() throws Exception {
        assertThat(SIX.next(), is(SEVEN));
    }

    @Test
    public void calculate_ZERO_as_the_next_game_after_SEVEN() throws Exception {
        assertThat(SEVEN.next(), is(ZERO));
    }
}