package Task5;

//птицы - орёл

class Eagle extends Animal {

    public Eagle(String name, boolean animalType, double weight, int velocity) {
        super(name, animalType, weight, velocity);
        setPredatorsCount();
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("мяса");

        if (isAnimalType() == true && getWeight() > 5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        }
    }
}
