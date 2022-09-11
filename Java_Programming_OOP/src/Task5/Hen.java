package Task5;

//домашние животные - петух

class Hen extends Animal {

    public Hen(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setHerbivoresCount();
    }

    @Override
    void getCountTypeFood() {
        if (!isAnimalType())
            setTypeFood("зерна");

        if (isAnimalType() == false && getWeight() > 4.5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        } else if (isAnimalType() == false && getWeight() < 4.5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        }
    }
}
