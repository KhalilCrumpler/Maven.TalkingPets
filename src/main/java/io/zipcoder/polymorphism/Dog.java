package io.zipcoder.polymorphism;

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

   public void setName(String name){
        this.name = name;
   }

   public String getName(){
        return this.name;
   }
    public String speak(){
        return "Bark";
    }
}
