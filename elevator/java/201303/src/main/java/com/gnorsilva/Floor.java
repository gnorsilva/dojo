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
}
