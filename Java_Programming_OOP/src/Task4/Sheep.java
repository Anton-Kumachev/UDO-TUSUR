package Task4;

//домашние животные - овечка

class Sheep extends Animal {

    public Sheep(String name, boolean animalType, double weight) {
        super(name, animalType, weight);
    }

    @Override
    void getCountTypeFood() {
        if (!isAnimalType())
            setTypeFood("сена");

        if (isAnimalType() == false && getWeight() > 50) {
            setFoodCount(Math.round((getWeight() / 10) * 100.0) / 100.0);
        } else if (isAnimalType() == false && getWeight() < 50) {
            setFoodCount(Math.round((getWeight() / 15) * 100.0) / 100.0);
        }
    }
}
