package com.gnorsilva;

import org.junit.Ignore;
import org.junit.Test;

import static com.gnorsilva.PotterBooks.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookPriceCalculatorShould {

    private final BookPriceCalculator priceCalculator = new BookPriceCalculator();
    private final Order order = new Order();

    @Test
    public void calculate_full_price_for_a_single_book() throws Exception {
        order.addBooks(FIRE, 1);
        double price = priceCalculator.getPriceFor(order);
        assertThat(price, is(BOOK_PRICE));
    }

    @Ignore
    @Test
    public void calculate_full_price_for_two_identical_books() throws Exception {
        order.addBooks(FIRE, 2);
        double price = priceCalculator.getPriceFor(order);
        double expectedPrice = BOOK_PRICE * 2;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_5_percent_discount_for_two_different_books() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(EARTH, 1);
        double price = priceCalculator.getPriceFor(order);
        double expectedPrice = (BOOK_PRICE * 2) * 0.95;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_10_percent_discount_for_three_different_books() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(EARTH, 1);
        order.addBooks(WATER, 1);
        double price = priceCalculator.getPriceFor(order);
        double expectedPrice = (BOOK_PRICE * 3) * 0.90;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_20_percent_discount_for_four_different_books() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(EARTH, 1);
        order.addBooks(WATER, 1);
        order.addBooks(AIR, 1);
        double price = priceCalculator.getPriceFor(order);
        double expectedPrice = (BOOK_PRICE * 4) * 0.80;
        assertThat(price, is(expectedPrice));
    }

    @Test
    public void calculate_a_price_with_25_percent_discount_for_five_different_books() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(EARTH, 1);
        order.addBooks(WATER, 1);
        order.addBooks(AIR, 1);
        order.addBooks(SPIRIT, 1);
        double price = priceCalculator.getPriceFor(order);
        double expectedPrice = (BOOK_PRICE * 5) * 0.75;
        assertThat(price, is(expectedPrice));
    }



}
