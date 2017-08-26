package tools;

import com.zoo.animals.Animal;
import com.zoo.animals.Elephant;
import com.zoo.animals.Snake;
import com.zoo.animals.Tiger;
import com.zoo.animals.rare.SiberianTiger;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {

    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new SiberianTiger("johny", 82));
        animals.add(new Snake("bobby", 12));
        animals.add(new Snake("pytonus", 99));
        animals.add(new Elephant("franek", 89));
        animals.add(new Tiger("misio", 23));

        return animals;

    }
}
