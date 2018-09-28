package org.sla;

public class Clothing {
    private int size;
    private String style;
    private int price;
    private boolean colorful;
    private boolean purchased;
    private String clothingType;

    Clothing (int ourSize, String ourStyle, int ourPrice, boolean isColorful, boolean isPurchased, String type) {
        size = ourSize;
        style = ourStyle;
        price = ourPrice;
        colorful = isColorful;
        purchased = isPurchased;
        clothingType = "clothing";
    }

    void describe() {

    }

    void purchase() {

    }


    void setPurchased(boolean purchase) {
        purchased = purchase;
    }

    boolean getColourful() {
        return colorful;
    }

    boolean getPurchased() {
        return purchased;
    }

    String getStyle() {
        return style + " " + clothingType;
    }

    int getSize() {
        return size;
    }

    int getPrice() {
        return price;
    }

}
