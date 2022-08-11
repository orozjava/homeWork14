package com.company;

public class Person {
    private String name;
    private String desingnation;

    public Person(String name, String desingnation) {
        this.name = name;
        this.desingnation = desingnation;
    }

    public void learn(){
        System.out.println("окуйт");
    }
    public void walk(){
        System.out.println("сейилдейт, чуркайт");
    }
    public void eat(){
        System.out.println("тамактанат");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", desingnation = '" + desingnation + '\'' +
                '}';
    }
}
