package com.gnorsilva;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FloorShould {

    Floor _1 = new Floor(1);
    Floor _3 = new Floor(3);
    Floor _4 = new Floor(4);

    @Test
    public void know_when_its_between_two_ascending_floors() throws Exception {
        assertTrue(_3.isBetween(_1, _4));
    }

    @Test
    public void know_when_its_between_two_descending_floors() throws Exception {
        assertTrue(_3.isBetween(_4, _1));
    }

    @Test
    public void know_when_its_NOT_between_two_ascending_floors() throws Exception {
        assertFalse(_4.isBetween(_1, _3));
    }

    @Test
    public void know_when_its_NOT_between_two_descending_floors() throws Exception {
        assertFalse(_4.isBetween(_3, _1));
    }
}
