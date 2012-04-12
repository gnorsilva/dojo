package com.gnorsilva;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookDiscountCalculatorShould {

    @Test
    public void calculate_no_discount_for_one_book() throws Exception {
        BookDiscountCalculator calculator = new BookDiscountCalculator(1);
        double discount = calculator.calculateDiscount();
        assertThat(discount, is(0.0));
    }

    @Test
    public void calculate_5_percent_discount_for_two_different_books() throws Exception {
        BookDiscountCalculator calculator = new BookDiscountCalculator(2);
        double discount = calculator.calculateDiscount();
        assertThat(discount, is(0.05));
    }

    @Test
    public void calculate_10_percent_discount_for_three_different_books() throws Exception {
        BookDiscountCalculator calculator = new BookDiscountCalculator(3);
        double discount = calculator.calculateDiscount();
        assertThat(discount, is(0.10));
    }

    @Test
    public void calculate_20_percent_discount_for_four_different_books() throws Exception {
        BookDiscountCalculator calculator = new BookDiscountCalculator(4);
        double discount = calculator.calculateDiscount();
        assertThat(discount, is(0.20));
    }

    @Test
    public void calculate_25_percent_discount_for_five_different_books() throws Exception {
        BookDiscountCalculator calculator = new BookDiscountCalculator(5);
        double discount = calculator.calculateDiscount();
        assertThat(discount, is(0.25));
    }

}
