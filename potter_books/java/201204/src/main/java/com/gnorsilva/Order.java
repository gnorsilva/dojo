package com.gnorsilva;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private final Map<PotterBooks,Integer> books = new HashMap<PotterBooks, Integer>();

    public void addBooks(PotterBooks book, int numberOfBooks) {
        books.put(book, getNumberOfBooks(book) + numberOfBooks);
    }

    public int getTotalNumberOfBooks() {
        int totalNumberOfBooks = 0;
        for (PotterBooks book : books.keySet()) {
            totalNumberOfBooks += books.get(book);
        }
        return totalNumberOfBooks;
    }

    public int getNumberOfBooks(PotterBooks book) {
        int numberOfBooks = 0;
        if (books.containsKey(book)) {
            numberOfBooks = books.get(book);
        }
        return numberOfBooks;
    }

    public Map<PotterBooks, Integer> getBooks() {
        return new HashMap<PotterBooks, Integer>(books);
    }
}
