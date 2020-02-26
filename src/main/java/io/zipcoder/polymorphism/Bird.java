package io.zipcoder.polymorphism;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String speak(){
        return "Keet";
    }
}
