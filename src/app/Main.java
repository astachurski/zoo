package app;

import com.zoo.animals.Animal;
import com.zoo.animals.Tiger;
import com.zoo.animals.rare.SiberianTiger;

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



    }
}
