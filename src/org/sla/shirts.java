package org.sla;

public class shirts {
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
        System.out.println("This size " + getSize() + "Shirt is $" + getPrice());
        if (colorful) {
            System.out.println("This is very colorful");

        }
        System.out.println("This style is" + style);
        if (purchased) {
            System.out.println("This item has been purchased");
        }else{
            System.out.println("This item has not been purchased");
        }
    }

    void purchase() {
       if (!purchased) {
           System.out.println("Gracias for buying this" + style + "!");
           purchased = true;
       }
    }
}
