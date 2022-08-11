package com.company;

public class Singer extends Person{

    private final String bandName;

    public Singer(String name, String desingnation, String bandName) {
        super(name, desingnation);
        this.bandName = bandName;
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
    public void singing(){
        System.out.println("ырдайт");
    }
    public void playGitar(){
        System.out.println("гитара менен ойнойт");
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public String toString() {
        return "Singer {" +
                "bandName = '" + bandName + '\'' +
                "} " + super.toString();
    }
}
