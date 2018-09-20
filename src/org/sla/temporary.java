package org.sla;

class temporary {
    public static void main(String[] args) {
        System.out.println("Here is our selection of shoes:");
        System.out.println(" ");

        shoes toeshoe = new shoes();
        toeshoe.size = 10;
        toeshoe.style = "Toe Shoe";
        toeshoe.price = 40;
        toeshoe.colorful = false;
        toeshoe.describe();

        System.out.println(" ");

        shoes flipflop = new shoes();
        flipflop.size = 8;
        flipflop.style = "Flip Flop";
        flipflop.price = 5;
        flipflop.colorful = true;
        flipflop.describe();

        System.out.println(" ");

        shoes slipper = new shoes();
        slipper.size = 7;
        slipper.style = "Slipper";
        slipper.price = 20;
        slipper.colorful = true;
        slipper.describe();

        System.out.println(" ");

        shoes sneaker = new shoes();
        sneaker.size = 12;
        sneaker.style = "Sneaker";
        sneaker.price = 100;
        sneaker.colorful = false;
        sneaker.describe();

        System.out.println(" ");

        shoes snowshoe = new shoes();
        snowshoe.size = 10;
        snowshoe.style = "Snow Shoe";
        snowshoe.price = 120;
        snowshoe.colorful = true;
        snowshoe.describe();

        System.out.println(" ");

        System.out.println("Do you want to buy any shoes?");
        System.out.println(" ");
        toeshoe.purchase();
        System.out.println(" ");
        sneaker.purchase();
        System.out.println(" ");
        slipper.purchase();

    }

}
