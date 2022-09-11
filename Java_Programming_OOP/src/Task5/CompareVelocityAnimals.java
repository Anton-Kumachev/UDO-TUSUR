package Task5;

import java.util.Comparator;

public class CompareVelocityAnimals implements Comparator <Animal> {
    @Override
    public int compare(Animal obj1, Animal obj2) {
        if (obj1.getVelocity() < obj2.getVelocity())
            return -1;
        else if (obj2.getVelocity() < obj1.getVelocity())
            return 1;
        return 0;
    }
}
