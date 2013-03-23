package com.gnorsilva;

public class Floor {
    public final int value;

    public Floor(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Floor && ((Floor) o).value == value;
    }

    public boolean isNot(Floor other) {
        return !equals(other);
    }

    public boolean isBetween(Floor a, Floor b) {
        int currentDelta = Math.abs(a.value - b.value);
        int possibleDelta = Math.abs(a.value - value);
        return possibleDelta < currentDelta;
    }
}
