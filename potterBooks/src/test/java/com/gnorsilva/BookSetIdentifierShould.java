package com.gnorsilva;

import org.junit.Test;

import static com.gnorsilva.PotterBooks.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookSetIdentifierShould {

    @Test
    public void identify_a_single_book_set_as_one_book() throws Exception {
        BookSetIdentifier identifier = new BookSetIdentifier(new Order(A));
        int numberOfUniqueBooks = identifier.nextNumberOfUniqueBooks();
        assertThat(numberOfUniqueBooks, is(1));
    }

    @Test
    public void identify_two_identical_books_as_two_sets_of_one_book() throws Exception {
        BookSetIdentifier identifier = new BookSetIdentifier(new Order(A,A));
        assertThat(identifier.nextNumberOfUniqueBooks(), is(1));
        assertThat(identifier.nextNumberOfUniqueBooks(), is(1));
    }


    private class BookSetIdentifier {

        private final Order order;

        public BookSetIdentifier(Order order) {
            this.order = order;
        }

        public int nextNumberOfUniqueBooks() {
            return order.getNumberOfBooks();
        }
    }
}
