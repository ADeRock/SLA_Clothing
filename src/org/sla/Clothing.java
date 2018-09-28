package org.sla;

public class Clothing {
    private int size;
    private String style;
    private int price;
    private boolean colorful;
    private boolean purchased = false;

    Clothing (int ourSize, String ourStyle, int ourPrice, boolean isColorful, boolean isPurchased) {
        size = ourSize;
        style = ourStyle;
        price = ourPrice;
        colorful = isColorful;
        purchased = isPurchased;
    }

    boolean getColourful() {
        return colorful;
    }

    boolean getPurchased() {
        return purchased;
    }

    String getStyle() {
        return style;
    }

    int getSize() {
        return size;
    }

    int getPrice() {
        return price;
    }

}
