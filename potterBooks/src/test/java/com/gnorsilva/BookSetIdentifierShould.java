package com.gnorsilva;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.gnorsilva.PotterBooks.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookSetIdentifierShould {

    private final Order order = new Order();

    @Test
    public void identify_a_single_book_set_as_one_book() throws Exception {
        order.addBooks(FIRE, 1);
        BookSetIdentifier identifier = new BookSetIdentifier(order);
        int numberOfUniqueBooks = identifier.nextSetNumberOfBooks();
        assertThat(numberOfUniqueBooks, is(1));
    }

    @Test
    public void identify_two_identical_books_as_two_sets_of_one_book() throws Exception {
        order.addBooks(FIRE, 2);
        BookSetIdentifier identifier = new BookSetIdentifier(order);
        assertThat(identifier.nextSetNumberOfBooks(), is(1));
        assertThat(identifier.nextSetNumberOfBooks(), is(1));
    }

    @Test
    public void identify_two_different_books_as_one_set_of_two_books() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(WATER, 1);
        BookSetIdentifier identifier = new BookSetIdentifier(order);
        assertThat(identifier.nextSetNumberOfBooks(), is(2));
    }

    @Test
    public void identify_a_set_of_two_books_and_a_set_of_one_book() throws Exception {
        order.addBooks(FIRE, 1);
        order.addBooks(WATER, 2);
        BookSetIdentifier identifier = new BookSetIdentifier(order);
        assertThat(identifier.nextSetNumberOfBooks(), is(2));
        assertThat(identifier.nextSetNumberOfBooks(), is(1));
    }


    private class BookSetIdentifier {

        private final Map<PotterBooks,Integer> books;

        public BookSetIdentifier(Order order) {
            books = order.getBooks();
        }

        public int nextSetNumberOfBooks() {


            return books.size();
        }
    }
}
