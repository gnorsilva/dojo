package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.EnumIteratorShould.Letters.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EnumIteratorShould {

    enum Letters implements IterableEnum {
        A, B, C;

        @Override
        public Enum<? extends IterableEnum> next() {
            return null;
        }
    }

    EnumIterator iterator = new EnumIterator();

    @Test
    public void iterate_to_B_after_A() {
        Letters currentEnum = A;
        Letters nextEnum = (Letters) iterator.getNextEnum(Letters.values(), currentEnum);
        assertThat(nextEnum, is(B));
    }

    @Test
    public void iterate_to_C_after_B() {
        Letters currentEnum = B;
        Letters nextEnum = (Letters) iterator.getNextEnum(Letters.values(), currentEnum);
        assertThat(nextEnum, is(C));
    }

    @Test
    public void iterate_to_A_after_C() {
        Letters currentEnum = C;
        Letters nextEnum = (Letters) iterator.getNextEnum(Letters.values(), currentEnum);
        assertThat(nextEnum, is(A));
    }

}
