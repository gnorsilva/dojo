package com.gnorsilva;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BowlingGameShould {

    private final BowlingGame bowlingGame = new BowlingGame();

    @Test public void
    calculate_a_score_of_90_for_10_roll_pairs_of_9_and_a_miss() {
        for (int frame = 0; frame < 10; frame++) {
            roll(9);
            roll(0);
        }
        assertThat(score(), is(90));
    }

    @Test public void
    calculate_a_score_of_19_when_rolling_a_3_5_and_9() {
        roll(3);
        roll(5);
        roll(9);
        assertThat(score(), is(17));
    }

    @Test public void
    calculate_a_score_of_150_for_10_roll_pairs_of_5_and_a_final_5() {
        for (int frame = 0; frame < 10; frame++) {
            roll(5);
            roll(5);
        }
        roll(5);
        assertThat(score(), is(150));
    }

    @Test public void
    calculate_a_score_of_21_when_rolling_a_spare_a_4_and_a_3() {
        roll(3);
        roll(7);
        roll(4);
        roll(3);
        assertThat(score(), is(21));
    }

    @Test public void
    calculate_a_score_of_18_when_rolling_a_spare_and_a_4() {
        roll(3);
        roll(7);
        roll(4);
        assertThat(score(), is(18));
    }

    @Test public void
    calculate_a_score_of_24_when_rolling_a_0_a_strike_a_3_and_a_4() {
        roll(0);
        roll(10);
        roll(3);
        roll(4);
        assertThat(score(), is(24));
    }

    @Test public void
    calculate_a_score_of_24_when_rolling_a_strike_a_3_and_a_4() {
        roll(10);
        roll(3);
        roll(4);
        assertThat(score(), is(24));
    }


    @Test public void
    calculate_a_score_of_30_when_rolling_a_spare_and_a_strike() {
        roll(3);
        roll(7);
        roll(10);
        assertThat(score(), is(30));
    }

    @Test public void
    calculate_a_score_of_38_when_rolling_a_strike_a_spare_and_a_4() {
        roll(10);
        roll(3);
        roll(7);
        roll(4);
        assertThat(score(), is(38));
    }

    @Test public void
    calculate_a_score_of_300_for_10_strikes_and_two_extra_rolls_of_10() {
        for (int frame = 0; frame < 10; frame++) {
            roll(10);
        }
        roll(10);
        roll(10);
        assertThat(score(), is(300));
    }

    private void roll(int pins) {
        bowlingGame.roll(pins);
    }

    private int score() {
        return bowlingGame.score();
    }
}
