package Task5;

//домашние животные - кот/кошка

class Cat extends Animal {

    public Cat(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setPredatorsCount();
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("рыбы");

        if (isAnimalType() == true && getWeight() > 10) {
            setFoodCount(Math.round((getWeight() / 6) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 10) {
            setFoodCount(Math.round((getWeight() / 6) * 100.0) / 100.0);
        }
    }
}
