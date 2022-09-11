package Task5;

//птицы - коршун

class Kite extends Animal {

    public Kite(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setPredatorsCount();
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("мяса");

        if (isAnimalType() == true && getWeight() > 1.5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 1) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        }
    }
}
