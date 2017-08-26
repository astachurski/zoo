package com.zoo.infrastructure;

import com.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Building {

    String name;

    List<Animal> animalList = new ArrayList();

    public Building(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) {
        animal.setBuilding(this);
        animalList.add(animal);
    }

    public void getAnimalNames() {
        for (Animal animal : animalList) {
            System.out.println(animal.getClass().getCanonicalName());
        }
    }

    public String getName() {
        return name;
    }

    public Animal getAnimalByName(String name) {
        Animal result = null;
        for (Animal animal : animalList) {
            if (animal.getName().equals(name)) {
                result = animal;
                break;
            }
        }
        return result;
    }
}
