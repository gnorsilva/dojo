package com.gnorsilva;

public class BookPriceCalculator {

    public double getPriceFor(Order order) {
        int numberOfBooks = order.getTotalNumberOfBooks();
        BookDiscountCalculator calculator = new BookDiscountCalculator(numberOfBooks);
        double price = ( numberOfBooks * 10 ) * ( 1 - calculator.calculateDiscount());
        return price;
    }
}
