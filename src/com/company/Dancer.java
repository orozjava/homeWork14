package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String desingnation, String groupName) {
        super(name, desingnation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    @Override
    public void learn(){
        super.learn();
    }
    @Override
    public void walk(){
        super.walk();
    }
    @Override
    public void eat(){
        super.eat();
    }

    public void dancing(){
        System.out.println("бийлейт");
    }

    @Override
    public String toString() {
        return "Dancer{" +
        "groupName = '" + groupName + '\'' +
                "} " + super.toString();
    }
}
