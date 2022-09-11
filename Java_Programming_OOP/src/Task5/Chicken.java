package Task5;

//домашние животные - курица

class Chicken extends Animal {

    public Chicken(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setHerbivoresCount();
    }

    @Override
    void getCountTypeFood() {
        if (!isAnimalType())
            setTypeFood("зерна");

        if (isAnimalType() == false && getWeight() > 3.5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        } else if (isAnimalType() == false && getWeight() < 3.5) {
            setFoodCount(Math.round((getWeight() / 7) * 100.0) / 100.0);
        }
    }
}
