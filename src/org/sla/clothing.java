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
    }
}