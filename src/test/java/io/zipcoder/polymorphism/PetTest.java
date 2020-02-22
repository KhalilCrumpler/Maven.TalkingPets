package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void testMultiplePets(){
        //given
        Dog newDog = Dog.new("fido");
        Cat newCat = Cat.new("tom");
        Rabbit newRabbit = Rabbit.new("Roger");

        //when
        boolean isDog = newDog != null;
        boolean isCat = newCat != null;
        boolean isRabbit = newRabbit != null;

        //then
        Assert.assertTrue(isDog);
        Assert.assertTrue(isCat);
        Assert.assertTrue(isRabbit);

    }
    @Test
    public void testSpeak(){
        //given
        Dog newDog = Dog.new("fido");
        Cat newCat = Cat.new("tom");
        Rabbit newRabbit = Rabbit.new("Roger");
        String dogBark = "Woof!";
        String catMeow = "Meow!";
        String rabbitNoise = "Rabbit Noise";

        //when
        String dogSound = Dog.speak();
        String catSound = Cat.speak();
        String rabbitSound = Rabbit.speak();

        //then
        Assert.assertEquals(dogBark, dogSound);
        Assert.assertEquals(catMeow, catSound);
        Assert.assertEquals(rabbitNoise, rabbitSound);

    }

    @Test
    public void testPetName(){
        // given
        String expected = "Petster";
        Pet pet = Pet.new(expected);


        //when
        String actual = Pet.getName();

        //then
        Assert.assertEquals(expected, actual);

    }

}
