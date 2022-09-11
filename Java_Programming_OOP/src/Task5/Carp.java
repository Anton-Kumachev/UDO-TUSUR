package Task5;

//рыбы - карп

class Carp extends Animal {

    public Carp(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setHerbivoresCount();
    }

    @Override
    void getCountTypeFood() {
        if (!isAnimalType())
            setTypeFood("крупы");

        if (isAnimalType() == false && getWeight() > 5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        } else if (isAnimalType() == false && getWeight() < 5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        }
    }
}
