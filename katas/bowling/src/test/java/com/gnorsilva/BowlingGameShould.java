package com.gnorsilva;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BowlingGameShould {

    @Test public void
    calculate_a_score_of_90_for_10_roll_pairs_of_9_and_a_miss() {
        for (int frame = 0; frame < 10; frame++) {
            roll(9);
            roll(0);
        }
        assertThat(score(), is(90));
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

    @Ignore
    @Test public void
    calculate_a_score_of_300_for_10_strikes_and_two_extra_rolls_of_10() {
        for (int frame = 0; frame < 10; frame++) {
            roll(10);
        }
        roll(10);
        roll(10);
        assertThat(score(), is(300));
    }

    int frames [][] = new int[11][2];
    int frameCounter = 0;
    boolean firstRoll = true;

    private void roll(int pins) {
        int [] frame = frames[frameCounter];
        if (firstRoll) {
            frame[0] = pins;
        } else {
            frame[1] = pins;
            frameCounter++;
        }
        firstRoll = !firstRoll;
    }

    private int score() {
        int totalScore = 0;

        for (int index = 0; index < 10; index++) {
            int[] frame = frames[index];
            int frameScore = frame[0] + frame[1];
            totalScore += frameScore;
            if (frameScore == 10) {
                totalScore += frames[index + 1][0];
            }
        }

        return totalScore;
    }
}
