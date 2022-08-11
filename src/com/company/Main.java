package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("============================================================");
        Programmer pr = new Programmer("Oroz", "Java student", "Peaksoft House");
        System.out.println(pr.toString());
        pr.learn();
        pr.walk();
        pr.eat();
        pr.coding();
        System.out.println("============================================================");
        Dancer dc = new Dancer("Oroz", "Yo-Yo", "Linkin Park");
        System.out.println(dc.toString());
        dc.learn();
        dc.walk();
        dc.eat();
        dc.dancing();
        System.out.println("============================================================");
        Singer sn = new Singer("Maha", "singer", "Metal Group");
        System.out.println(sn.toString());
        sn.learn();
        sn.walk();
        sn.eat();
        sn.singing();
        sn.playGitar();



        



    }
}
