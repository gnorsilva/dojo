package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.Points.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointsShould {

    @Test
    public void calculate_FIFTEEN_as_the_next_point_after_ZERO() throws Exception {
        assertThat(ZERO.next(), is(FIFTEEN));
    }

    @Test
    public void calculate_THIRTY_as_the_next_point_after_FIFTEEN() throws Exception {
        assertThat(FIFTEEN.next(), is(THIRTY));
    }

    @Test
    public void calculate_FORTY_as_the_next_point_after_THIRTY() throws Exception {
        assertThat(THIRTY.next(), is(FORTY));
    }

    @Test
    public void calculate_ADVANTAGE_as_the_next_point_after_FORTY() throws Exception {
        assertThat(FORTY.next(), is(ADVANTAGE));
    }

    @Test
    public void calculate_ZERO_as_the_next_point_after_ADVANTAGE() throws Exception {
        assertThat(ADVANTAGE.next(), is(ZERO));
    }

}