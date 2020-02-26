package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void speakTest(){
        Dog dog = new Dog("Fido");
        String expected ="Bark";
        Cat cat = new Cat("Tom");
        String catExpected = "Meow";
        String actual= dog.speak();
        Bird bird = new Bird("Big Bird");
        String birdExpected = "Keet";
        String catActual = cat.speak();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(catExpected,catActual);

    }

    @Test
    public void nameTest(){
        Dog dog = new Dog("Fido");
        String expected = "Kasper";
        dog.setName("Kasper");
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

}