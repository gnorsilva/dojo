package com.gnorsilva;

public class BookDiscountCalculator {
    private final int numberOfDifferentBooks;

    public BookDiscountCalculator(int numberOfDifferentBooks) {
        this.numberOfDifferentBooks = numberOfDifferentBooks;
    }

    public double calculateDiscount() {
        double discount;
        switch (numberOfDifferentBooks) {
            default:
                discount = 0;
                break;
            case 2:
                discount = 0.05;
                break;
            case 3:
                discount = 0.1;
                break;
            case 4:
                discount = 0.2;
                break;
            case 5:
                discount = 0.25;
                break;
        }
        return discount;
    }
}
