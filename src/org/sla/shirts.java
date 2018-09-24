package org.sla;

public class shirts extends clothing{
    void describe() {
        System.out.println("This size " + getSize() + " Shirt is $" + getPrice());
        if (colorful) {
            System.out.println("This is very colorful");

        }
        System.out.println("This style is " + style);
        if (purchased) {
            System.out.println("This item has been purchased");
        }else{
            System.out.println("This item has not been purchased");
        }
    }

    void purchase() {
       if (!purchased) {
           System.out.println("Gracias for buying this " + style + "!");
           purchased = true;
       }
    }
}
