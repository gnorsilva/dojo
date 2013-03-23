package com.gnorsilva;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Map;

import static com.gnorsilva.PotterBooks.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class OrderShould {

    private final Order order = new Order();

    @Test
    public void allow_to_add_one_book() throws Exception {
        order.addBooks(FIRE, 1);
        assertThat(order.getNumberOfBooks(FIRE), is(1));
    }

    @Test
    public void allow_to_add_two_books_of_the_same_type() throws Exception {
        order.addBooks(FIRE, 2);
        assertThat(order.getNumberOfBooks(FIRE), is(2));
    }

    @Test
    public void allow_to_add_two_books_of_the_same_type_but_not_at_the_same_time() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(FIRE, 1);
        assertThat(order.getNumberOfBooks(FIRE), is(2));
    }

    @Test
    public void allow_to_add_two_different_books() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(EARTH, 1);
        assertThat(order.getNumberOfBooks(FIRE), is(1));
        assertThat(order.getNumberOfBooks(EARTH), is(1));
    }

    @Test
    public void allow_to_add_three_books_of_two_different_books() throws Exception {
        order.addBooks(WATER, 1);
        order.addBooks(AIR, 2);
        assertThat(order.getNumberOfBooks(WATER), is(1));
        assertThat(order.getNumberOfBooks(AIR), is(2));
    }

    @Test
    public void return_zero_for_books_not_present_in_the_order() throws Exception {
        assertThat(order.getNumberOfBooks(FIRE), is(0));
    }

    @Test
    public void return_the_total_number_of_books_in_an_order() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(EARTH, 1);
        order.addBooks(WATER, 1);
        order.addBooks(AIR, 2);
        order.addBooks(SPIRIT, 3);
        assertThat(order.getTotalNumberOfBooks(), is(8));
    }

    @Test
    public void return_a_copy_of_the_books_added_to_it() throws Exception {
        order.addBooks(FIRE, 1);
        Map<PotterBooks,Integer> originalBooks = order.getBooks();
        order.addBooks(EARTH, 1);
        assertThat(originalBooks.size(), is(1));
    }
}
