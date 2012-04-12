package com.gnorsilva;

import java.util.Arrays;
import java.util.List;

public class Order {

    private final List<PotterBooks> books;

    public Order(PotterBooks... books) {
        this.books = Arrays.asList(books);
    }

    public void addBooks(PotterBooks book, int numberOfBooks) {
        //TODO should we implement this? or go with the hashmap idea?
    }

    public int getNumberOfBooks() {
        return books.size();
    }
}
