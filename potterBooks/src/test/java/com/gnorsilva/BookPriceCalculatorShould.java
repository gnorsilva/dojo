package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.PotterBooks.*;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookPriceCalculatorShould {

    private final BookPriceCalculator priceCalculator = new BookPriceCalculator();

    @Test
    public void calculate_full_price_for_a_single_book() throws Exception {
        double price = priceCalculator.getPriceFor(new Order(A));
        assertThat(price, is(BOOK_PRICE));
    }

    @Test
    public void calculate_full_price_for_two_identical_books() throws Exception {
        double price = priceCalculator.getPriceFor(new Order(A,A));
        double expectedPrice = BOOK_PRICE * 2;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_5_percent_discount_for_two_different_books() throws Exception {
        double price = priceCalculator.getPriceFor(new Order(A,B));
        double expectedPrice = (BOOK_PRICE * 2) * 0.95;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_10_percent_discount_for_three_different_books() throws Exception {
        double price = priceCalculator.getPriceFor(new Order(A,B,C));
        double expectedPrice = (BOOK_PRICE * 3) * 0.90;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_20_percent_discount_for_four_different_books() throws Exception {
        double price = priceCalculator.getPriceFor(new Order(A,B,C,D));
        double expectedPrice = (BOOK_PRICE * 4) * 0.80;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_25_percent_discount_for_five_different_books() throws Exception {
        double price = priceCalculator.getPriceFor(new Order(A,B,C,D,E));
        double expectedPrice = (BOOK_PRICE * 5) * 0.75;
        assertThat(price, is(expectedPrice));
    }



}
