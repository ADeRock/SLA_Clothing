package org.sla;

class clothing {
    public static void main(String[] args) {
        System.out.println("Here is our selection of shirts");
        System.out.println();

        //Short sleeve shirt
        shirts sshirts = new shirts();
        sshirts.size = 10;
        sshirts.style = "short";
        sshirts.price = 20;
        sshirts.colorful = true;
        sshirts.describe();

        System.out.println(" ");

        //Long sleeve
        shirts lshirts = new shirts();
        lshirts.size = 18;
        lshirts.style = "long";
        lshirts.price = 15;
        lshirts.colorful = true;
        lshirts.describe();

        System.out.println(" ");

        //Dress Shirt
        shirts dshirts = new shirts();
        dshirts.size = 24;
        dshirts.style = "dress";
        dshirts.price = 36;
        dshirts.colorful = false;
        dshirts.describe();

        System.out.println(" ");

        //Tank Top
        shirts tshirts = new shirts();
        tshirts.size = 14;
        tshirts.style = "Tank-Top";
        tshirts.price = 5;
        tshirts.colorful = false;
        tshirts.describe();

        System.out.println(" ");

        //Jersey
        shirts jshirts = new shirts();
        jshirts.size = 20;
        jshirts.style = "Jersey";
        jshirts.price = 100;
        jshirts.colorful = true;
        jshirts.describe();

        System.out.println(" ");

        System.out.println("Do you want to buy any shirts?");
        jshirts.purchase();

        System.out.println(" ");

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