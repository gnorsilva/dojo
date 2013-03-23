package com.gnorsilva;

public class EnumIterator {

    public Enum<? extends IterableEnum> getNextEnum(Enum<? extends IterableEnum>[] values,
                                                    Enum<? extends IterableEnum> testValue) {

        int nextIndex = testValue.ordinal() + 1;
        if (nextIndex >= values.length) {
            nextIndex = 0;
        }
        return values[nextIndex];
    }
}
