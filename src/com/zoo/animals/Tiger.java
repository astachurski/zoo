package com.zoo.animals;

public class Tiger extends Animal {
    public Tiger() {
        super("defaultTigerName", 30);
        //super();
        System.out.println("hello from Tiger() constructor");
        //super(70);

    }

    public Tiger(String name, Integer hungerLevel) {
        super(name, hungerLevel);
    }
    /*public Tiger(String name, Integer hungerLevel) {
        super(hungerLevel);
        setName(name);
        System.out.println("hello from Tiger(name, hungerLevel) constructor");
    }*/

    public Tiger(String name) {
        super();
        setName(name);

    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm Tiger - moving veeery fast!");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(" Wrrrrrrrrrrrrr !!!!");
    }
}
