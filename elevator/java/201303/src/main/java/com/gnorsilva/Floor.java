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

    @Override
    public String toString() {
        return value + "";
    }

    public boolean isBetween(Floor a, Floor b) {
        return (isAbove(a) && isBelow(b)) ||
               (isAbove(b) && isBelow(a));
    }

    public boolean isAbove(Floor other) {
        return value > other.value;
    }

    public boolean isBelow(Floor other) {
        return value < other.value;
    }
}
