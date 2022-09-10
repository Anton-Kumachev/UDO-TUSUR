package Task4;

//домашние животные - собака

class Dog extends Animal {

    public Dog(String name, boolean animalType, double weight) {
        super(name, animalType, weight);
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("мяса");

        if (isAnimalType() == true && getWeight() > 40) {
            setFoodCount(Math.round((getWeight() / 3) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 40) {
            setFoodCount(Math.round((getWeight() / 6) * 100.0) / 100.0);
        }
    }
}
