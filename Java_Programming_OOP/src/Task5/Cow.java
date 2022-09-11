package Task5;

//домашние животные - корова

class Cow extends Animal {

    public Cow(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setHerbivoresCount();
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
