package org.sla;

public class Shoes extends Clothing {


    void describe() {
        Shoes(int ourSize, String ourStyle, int ourPrice, boolean isColorful, boolean isPurchased) {
            super(ourSize, ourStyle, ourPrice, isColorful, isPurchased)
        }

        System.out.println("This size " + getSize() + " shoe is $" + getPrice());

        if (colorful) {
            System.out.println("This is very colorful.");
        }

        System.out.println("The style is " + style);

        if (purchased) {
            System.out.println("This item has been bought.");
        } else {
            System.out.println("This item has not been bought.");
        }
    }

    void purchase() {
        if (!purchased) {
            System.out.println("Thank you for purchasing the " + style +  "!");
            purchased = true;
        }
    }

}
