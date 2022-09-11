package Task5;

import java.util.Comparator;

public class CompareAnimals implements Comparator <Animal> {
    @Override
    public int compare(Animal obj1, Animal obj2) {
        if (obj2.getFoodCount() < obj1.getFoodCount())
            return -1;
        else if (obj1.getFoodCount() < obj2.getFoodCount())
            return 1;
        return 0;
    }
}
