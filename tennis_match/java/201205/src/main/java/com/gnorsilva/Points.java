package com.gnorsilva;

enum Points implements IterableEnum{
    ZERO, FIFTEEN, THIRTY, FORTY, ADVANTAGE;

    private final EnumIterator iterator = new EnumIterator();

    public Points next() {
        return (Points) iterator.getNextEnum(values(), this);
    }
}
