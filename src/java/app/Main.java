package app;

import com.zoo.animals.Animal;
import com.zoo.animals.rare.SiberianTiger;
import tools.AnimalFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        Tiger myTiger = new Tiger();
        Integer hungerLevel = myTiger.getHungerLevel();
        System.out.println(hungerLevel);
*/

        Animal myTiger = new SiberianTiger("Bubu", 78);
        System.out.println("name: " + myTiger.getName() + " hunger: " + myTiger.getHungerLevel());

        System.out.println(myTiger.toString());

        List<Animal> animalList = AnimalFactory.getAnimals();

        for (Animal animal : animalList) {

            System.out.println(animal.getName() + " " + animal.toString());
            animal.makeSound();
            System.out.println(" -------- ");

        }


    }
}
