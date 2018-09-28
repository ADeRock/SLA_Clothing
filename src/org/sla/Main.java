package org.sla;

class Main {
    public static void main(String[] args) {
        System.out.println("Here is our selection of Shirts");
        System.out.println();

        Clothing[] clothing = new Clothing[11];

        clothing[0] = new Shirts(10, "short", 20, true, false);

        System.out.println(" ");

        clothing[1] = new Shirts(10, "short", 20, true, false);

        //Long sleeve
        Shirts longshirts = new Shirts();
        longshirts.size = 18;
        longshirts.style = "long";
        longshirts.price = 15;
        longshirts.colorful = true;
        longshirts.describe();

        System.out.println(" ");

        clothing[2] = new Shirts(10, "short", 20, true, false);

        //Dress Shirt
        Shirts dressshirts = new Shirts();
        dressshirts.size = 24;
        dressshirts.style = "dress";
        dressshirts.price = 36;
        dressshirts.colorful = false;
        dressshirts.describe();

        System.out.println(" ");

        clothing[3] = new Shirts(10, "short", 20, true, false);

        //Tank Top
        Shirts tankshirts = new Shirts();
        tankshirts.size = 14;
        tankshirts.style = "Tank-Top";
        tankshirts.price = 5;
        tankshirts.colorful = false;
        tankshirts.describe();

        System.out.println(" ");

        clothing[4] = new Shirts(10, "short", 20, true, false);

        //Jersey
        Shirts jerseyshirts = new Shirts();
        jerseyshirts.size = 20;
        jerseyshirts.style = "Jersey";
        jerseyshirts.price = 100;
        jerseyshirts.colorful = true;
        jerseyshirts.describe();

        System.out.println(" ");

        clothing[5] = new Shirts(10, "short", 20, true, false);

        //Tunic
        Shirts tunicshirts = new Shirts();
        tunicshirts.size = 25;
        tunicshirts.style = "Tunic";
        tunicshirts.price = 30;
        tunicshirts.colorful = true;
        tunicshirts.describe();

        System.out.println(" ");

        System.out.println("Do you want to buy any Shirts?");
        jerseyshirts.purchase();
        tunicshirts.purchase();

        System.out.println(" ");

        System.out.println("Here is our selection of Shoes:");
        System.out.println(" ");

        clothing[6] = new Shoes(10, "Toe Shoe", 40, false, false);

        clothing[7] = new Shoes(8, "Flip Flop", 5, true, false);

        clothing[8] = new Shoes(10, "Slipper", 20, true, false);

        clothing[9] = new Shoes(12, "Sneaker", 100, false, false);

        clothing[10] = new Shoes(10, "Snow Shoe", 120, true, false);

        System.out.println("Do you want to buy any Shoes?");
        System.out.println(" ");
        clothing[6].purchase();
        System.out.println(" ");
        sneaker.purchase();
        System.out.println(" ");
        slipper.purchase();
    }
}
