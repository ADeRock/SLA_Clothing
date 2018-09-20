package org.sla;

class clothing {
    public static void main(String[] args) {
        System.out.println("Here is our selection of shirts");
        System.out.println();

        //Short sleeve shirt
        shirts shortshirts = new shirts();
        shortshirts.size = 10;
        shortshirts.style = "short";
        shortshirts.price = 20;
        shortshirts.colorful = true;
        shortshirts.describe();

        System.out.println(" ");

        //Long sleeve
        shirts longshirts = new shirts();
        longshirts.size = 18;
        longshirts.style = "long";
        longshirts.price = 15;
        longshirts.colorful = true;
        longshirts.describe();

        System.out.println(" ");

        //Dress Shirt
        shirts dressshirts = new shirts();
        dressshirts.size = 24;
        dressshirts.style = "dress";
        dressshirts.price = 36;
        dressshirts.colorful = false;
        dressshirts.describe();

        System.out.println(" ");

        //Tank Top
        shirts tankshirts = new shirts();
        tankshirts.size = 14;
        tankshirts.style = "Tank-Top";
        tankshirts.price = 5;
        tankshirts.colorful = false;
        tankshirts.describe();

        System.out.println(" ");

        //Jersey
        shirts jerseyshirts = new shirts();
        jerseyshirts.size = 20;
        jerseyshirts.style = "Jersey";
        jerseyshirts.price = 100;
        jerseyshirts.colorful = true;
        jerseyshirts.describe();

        System.out.println(" ");

        //Tunic
        shirts tunicshirts = new shirts();
        tunicshirts.size = 25;
        tunicshirts.style = "Tunic";
        tunicshirts.price = 30;
        tunicshirts.colorful = true;
        tunicshirts.describe();

        System.out.println(" ");

        System.out.println("Do you want to buy any shirts?");
        jerseyshirts.purchase();
        tunicshirts.purchase();

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

        shoes[] shoes = {toeshoe, flipflop, slipper, sneaker, snowshoe, snowshoe};
        int highestShoeCost = 0;
        shoes mostExpensiveShoe = shoes[0];

        for (int i = 0; i < shoes.length; i++) {
            if (shoes[i].getPrice() >= highestShoeCost) {
                highestShoeCost = shoes[i].getPrice();
                mostExpensiveShoe = shoes[i];
            }
        }

        System.out.println("Most expensive shoe is " + mostExpensiveShoe.style);
    }
}