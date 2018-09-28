package org.sla;

class Main {
    public static void main(String[] args) {
        System.out.println("Here is our selection of Shirts");
        System.out.println();

        //Short sleeve shirt
        Shirts shortshirts = new Shirts();
        shortshirts.size = 10;
        shortshirts.style = "short";
        shortshirts.price = 20;
        shortshirts.colorful = true;
        shortshirts.describe();

        System.out.println(" ");

        //Long sleeve
        Shirts longshirts = new Shirts();
        longshirts.size = 18;
        longshirts.style = "long";
        longshirts.price = 15;
        longshirts.colorful = true;
        longshirts.describe();

        System.out.println(" ");

        //Dress Shirt
        Shirts dressshirts = new Shirts();
        dressshirts.size = 24;
        dressshirts.style = "dress";
        dressshirts.price = 36;
        dressshirts.colorful = false;
        dressshirts.describe();

        System.out.println(" ");

        //Tank Top
        Shirts tankshirts = new Shirts();
        tankshirts.size = 14;
        tankshirts.style = "Tank-Top";
        tankshirts.price = 5;
        tankshirts.colorful = false;
        tankshirts.describe();

        System.out.println(" ");

        //Jersey
        Shirts jerseyshirts = new Shirts();
        jerseyshirts.size = 20;
        jerseyshirts.style = "Jersey";
        jerseyshirts.price = 100;
        jerseyshirts.colorful = true;
        jerseyshirts.describe();

        System.out.println(" ");

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

        Shoes toeshoe = new Shoes();
        toeshoe.size = 10;
        toeshoe.style = "Toe Shoe";
        toeshoe.price = 40;
        toeshoe.colorful = false;
        toeshoe.describe();

        System.out.println(" ");

        Shoes flipflop = new Shoes();
        flipflop.size = 8;
        flipflop.style = "Flip Flop";
        flipflop.price = 5;
        flipflop.colorful = true;
        flipflop.describe();

        System.out.println(" ");

        Shoes slipper = new Shoes();
        slipper.size = 7;
        slipper.style = "Slipper";
        slipper.price = 20;
        slipper.colorful = true;
        slipper.describe();

        System.out.println(" ");

        Shoes sneaker = new Shoes();
        sneaker.size = 12;
        sneaker.style = "Sneaker";
        sneaker.price = 100;
        sneaker.colorful = false;
        sneaker.describe();

        System.out.println(" ");

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

        Shoes[] shoes = {toeshoe, flipflop, slipper, sneaker, snowshoe, snowshoe};
        int highestShoeCost = 0;
        Shoes mostExpensiveShoe = shoes[0];

        for (int i = 0; i < shoes.length; i++) {
            if (shoes[i].getPrice() >= highestShoeCost) {
                highestShoeCost = shoes[i].getPrice();
                mostExpensiveShoe = shoes[i];
            }
        }

        System.out.println("Most expensive shoe is " + mostExpensiveShoe.style);

        Shirts[] shirts = {shortshirts, longshirts, tunicshirts, jerseyshirts, tankshirts, dressshirts};
        int highestShirtCost = 0;
        Shirts mostExpensiveShirt = shirts[0];

        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getPrice() >= highestShirtCost) {
                highestShirtCost = shirts[i].getPrice();
                mostExpensiveShirt = shirts[i];
            }
        }

        System.out.println("Most expensive shirt is " + mostExpensiveShirt.style);
    }
}