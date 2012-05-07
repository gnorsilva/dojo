package com.gnorsilva;

interface IterableEnum {
    Enum<? extends IterableEnum> next();
}
