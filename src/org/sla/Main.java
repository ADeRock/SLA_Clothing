package org.sla;

class Main {
    public static void main(String[] args) {
        System.out.println("Here is our selection of Shirts");
        System.out.println();

        Clothing[] clothing = new Clothing[11];

        clothing[0] = new Shirts(10, "short", 20, true, false);

        System.out.println(" ");

        clothing[1] = new Shirts(18, "long", 15, true, false);

        System.out.println(" ");

        clothing[2] = new Shirts(24, "dress", 36, false, false);

        System.out.println(" ");

        clothing[3] = new Shirts(14, "Tank-Top", 5, false, false);

        System.out.println(" ");

        clothing[4] = new Shirts(20, "Jersey", 100, true, false);

        System.out.println(" ");

        clothing[5] = new Shirts(25, "Tunic", 30, true, false);

        System.out.println(" ");

        System.out.println("Do you want to buy any Shirts?");
        jerseyshirts.purchase();
        tunicshirts.purchase();

        System.out.println(" ");

        System.out.println("Here is our selection of Shoes:");
        System.out.println(" ");

        clothing[6] = new Shirts(10, "short", 20, true, false);

        Shoes toeshoe = new Shoes();
        toeshoe.size = 10;
        toeshoe.style = "Toe Shoe";
        toeshoe.price = 40;
        toeshoe.colorful = false;
        toeshoe.describe();

        System.out.println(" ");

        clothing[7] = new Shirts(10, "short", 20, true, false);

        Shoes flipflop = new Shoes();
        flipflop.size = 8;
        flipflop.style = "Flip Flop";
        flipflop.price = 5;
        flipflop.colorful = true;
        flipflop.describe();

        System.out.println(" ");

        clothing[8] = new Shirts(10, "short", 20, true, false);

        Shoes slipper = new Shoes();
        slipper.size = 7;
        slipper.style = "Slipper";
        slipper.price = 20;
        slipper.colorful = true;
        slipper.describe();

        System.out.println(" ");

        clothing[9] = new Shirts(10, "short", 20, true, false);

        Shoes sneaker = new Shoes();
        sneaker.size = 12;
        sneaker.style = "Sneaker";
        sneaker.price = 100;
        sneaker.colorful = false;
        sneaker.describe();

        System.out.println(" ");

        clothing[10] = new Shirts(10, "short", 20, true, false);

        Shoes snowshoe = new Shoes();
        snowshoe.size = 10;
        snowshoe.style = "Snow Shoe";
        snowshoe.price = 120;
        snowshoe.colorful = true;
        snowshoe.describe();

        System.out.println(" ");

        System.out.println("Do you want to buy any Shoes?");
        System.out.println(" ");
        toeshoe.purchase();
        System.out.println(" ");
        sneaker.purchase();
        System.out.println(" ");
        slipper.purchase();

        System.out.println("Describe Yourself");
        for (int i = 0; i < 11; i++) {
            clothing[i].describe();
        }
    }
}
