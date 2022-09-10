package Task4;

//дикие животные - волк

class Wolf extends Animal {

    public Wolf(String name, boolean animalType, double weight) {
        super(name, animalType, weight);
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("мяса");

        if (isAnimalType() == true && getWeight() > 50) {
            setFoodCount(Math.round((getWeight() / 10) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 50) {
            setFoodCount(Math.round((getWeight() / 13) * 100.0) / 100.0);
        }
    }
}
