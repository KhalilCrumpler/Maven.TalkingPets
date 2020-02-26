package io.zipcoder.polymorphism;

public class Pet {
    String name;
    public Pet(String name){
        this.name = name;
    }
    public String speak(){
        //wrote just to pass the test.  Ideally I'd create a dog class and extend from pet.
        return "bark";
    }
}
