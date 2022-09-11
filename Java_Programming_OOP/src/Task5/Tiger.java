package Task5;

//дикие животные - тигр

class Tiger extends Animal {

    public Tiger(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setPredatorsCount();
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("мяса");

        if (isAnimalType() == true && getWeight() > 170) {
            setFoodCount(Math.round((getWeight() / 20) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 170) {
            setFoodCount(Math.round((getWeight() / 25) * 100.0) / 100.0);
        }
    }
}
