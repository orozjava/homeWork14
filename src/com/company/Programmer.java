package com.company;

public class Programmer extends Person {
    private final String companyName;

    public Programmer(String name, String desingnation, String companyName) {
        super(name, desingnation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    @Override
    public void learn(){
        System.out.println("окуйт");
    }
    public void walk(){
        System.out.println("сейилдейт, чуркайт");
    }
    public void eat(){
        System.out.println("тамактанат");
    }
    public void coding(){
        System.out.println("код жазат, программа тузот....");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName = '" + companyName + '\'' +
                " } " + super.toString();
    }
}
