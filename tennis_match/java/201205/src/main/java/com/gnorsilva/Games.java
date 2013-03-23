package com.gnorsilva;

public enum Games implements IterableEnum {
    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;

    private final EnumIterator iterator = new EnumIterator();

    public Games next() {
        return (Games) iterator.getNextEnum(values(), this);
    }
}
