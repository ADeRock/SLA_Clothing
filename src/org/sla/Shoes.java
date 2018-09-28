package org.sla;

public class Shoes extends Clothing {

    Shoes(int ourSize, String ourStyle, int ourPrice, boolean isColorful, boolean isPurchased) {
        super(ourSize, ourStyle, ourPrice, isColorful, isPurchased);
    }


    void describe() {
        System.out.println("This size " + getSize() + " shoe is $" + getPrice());

        if (getColourful()) {
            System.out.println("This is very colorful.");
        }

        System.out.println("The style is " + getStyle());

        if (getPurchased()) {
            System.out.println("This item has been bought.");
        } else {
            System.out.println("This item has not been bought.");
        }
    }

    void purchase() {
        if (!getPurchased()) {
            System.out.println("Thank you for purchasing the " + getStyle() +  "!");
            setPurchased(true);
        }
    }

}
