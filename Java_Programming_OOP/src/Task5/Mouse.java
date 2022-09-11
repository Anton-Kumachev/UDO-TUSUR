package Task5;

//домашние животные - мышь

class Mouse extends Animal {

    public Mouse(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setHerbivoresCount();
    }

    @Override
    void getCountTypeFood() {
        if (!isAnimalType())
            setTypeFood("сыра");

        if (isAnimalType() == false && getWeight() > 0.5) {
            setFoodCount(Math.round((getWeight() / 6) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 0.5) {
            setFoodCount(Math.round((getWeight() / 6) * 100.0) / 100.0);
        }
    }
}
