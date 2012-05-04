package com.gnorsilva;

enum GamePoint {
    ZERO, FIFTEEN, THIRTY, FORTY, ADVANTAGE;

    public GamePoint nextPoint() {
        int nextIndex;
        if (thisIsLastPoint()) {
            nextIndex = 0;
        } else {
            nextIndex = ordinal() + 1;
        }
        return values()[nextIndex];
    }

    private boolean thisIsLastPoint() {
        return ordinal() == values().length - 1;
    }
}
