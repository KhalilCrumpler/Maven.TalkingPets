package io.zipcoder.polymorphism;

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String speak(){
        return "Meow";
    }
}
