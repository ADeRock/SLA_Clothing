package org.sla;

class Main {
    public static void main(String[] args) {
        System.out.println("Here is our selection of Shirts");
        System.out.println();

        Clothing[] clothing = new Clothing[11];

        clothing[0] = new Shirts(10, "short", 20, true, false);


        clothing[1] = new Shirts(18, "long", 15, true, false);


        clothing[2] = new Shirts(24, "dress", 36, false, false);


        clothing[3] = new Shirts(14, "Tank-Top", 5, false, false);


        clothing[4] = new Shirts(20, "Jersey", 100, true, false);


        clothing[5] = new Shirts(25, "Tunic", 30, true, false);

        System.out.println("Describe Yourself");
        for (int i = 0; i < 5; i++) {
            clothing[i].describe();
            System.out.println(" ");
        }


        System.out.println("Do you want to buy any Shirts?");
        clothing[4].purchase();

        System.out.println(" ");

        System.out.println("Here is our selection of Shoes:");

        clothing[6] = new Shoes(10, "Toe Shoe", 40, false, false);

        clothing[7] = new Shoes(8, "Flip Flop", 5, true, false);

        clothing[8] = new Shoes(10, "Slipper", 20, true, false);

        clothing[9] = new Shoes(12, "Sneaker", 100, false, false);

        clothing[10] = new Shoes(10, "Snow Shoe", 120, true, false);

        System.out.println("Describe Yourself");
        for (int i = 6; i < 11; i++) {
            clothing[i].describe();
            System.out.println(" ");
        }

        System.out.println("Do you want to buy any Shirts?");
        clothing[7].purchase();
        System.out.println(" ");
        clothing[10].purchase();
    }
}
