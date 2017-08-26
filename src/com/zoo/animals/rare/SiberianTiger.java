package com.zoo.animals.rare;

import com.zoo.animals.Tiger;

public class SiberianTiger extends Tiger {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Siberian Tiger making noise!");
    }

    public SiberianTiger(String name, Integer hungerLevel) {
        super(name, hungerLevel);
        System.out.println("Siberian tiger created!");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm moving like SIBERIAN tiger!");
    }

    @Override
    public String toString() {
        return "Siberian tiger! - " + super.toString();
    }
}
