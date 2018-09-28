package org.sla;

public class Shirts extends Clothing {
    Shirts(int ourSize, String ourStyle, int ourPrice, boolean isColorful, boolean isPurchased) {
        super(ourSize, ourStyle, ourPrice, isColorful, isPurchased);
    }
    void describe() {
        System.out.println("This size " + getSize() + " Shirt is $" + getPrice());
        if (getColourful()) {
            System.out.println("This is very colorful");

        }
        System.out.println("This style is " + getStyle());
        if (getPurchased()) {
            System.out.println("This item has been purchased");
        }else{
            System.out.println("This item has not been purchased");
        }
    }

    void purchase() {
       if (!getPurchased()) {
           System.out.println("Gracias for buying this " + getStyle() + "!");
           setPurchased(true);
       }
    }
}
