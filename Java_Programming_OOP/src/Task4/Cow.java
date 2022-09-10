package Task4;

//домашние животные - корова

class Cow extends Animal {

    public Cow(String name, boolean animalType, double weight) {
        super(name, animalType, weight);
    }

    @Override
    void getCountTypeFood() {
        if (!isAnimalType())
            setTypeFood("травы");

        if (isAnimalType() == false && getWeight() > 500) {
            setFoodCount(Math.round((getWeight() / 15) * 100.0) / 100.0);
        } else if (isAnimalType() == false && getWeight() < 500) {
            setFoodCount(Math.round((getWeight() / 20) * 100.0) / 100.0);
        }
    }
}
