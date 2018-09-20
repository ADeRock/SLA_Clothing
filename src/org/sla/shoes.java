package org.sla;

public class shoes {
    int size;
    String style;
    int price;
    boolean colorful;
    boolean purchased = false;

    int getSize() {
        return size;
    }

    int getPrice() {
        return price;
    }

    void describe() {
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
