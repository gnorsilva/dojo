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
        return (above(a) && below(b)) ||
               (above(b) && below(a));
    }

    private boolean above(Floor other) {
        return value > other.value;
    }

    private boolean below(Floor other) {
        return value < other.value;
    }
}
