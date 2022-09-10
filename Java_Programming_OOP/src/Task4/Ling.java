package Task4;

//рыбы - щука

class Ling extends Animal {

    public Ling(String name, boolean animalType, double weight) {
        super(name, animalType, weight);
    }

    @Override
    void getCountTypeFood() {
        if (isAnimalType())
            setTypeFood("рыбок");

        if (isAnimalType() == true && getWeight() > 5) {
            setFoodCount(Math.round((getWeight() / 3) * 100.0) / 100.0);
        } else if (isAnimalType() == true && getWeight() < 5) {
            setFoodCount(Math.round((getWeight() / 5) * 100.0) / 100.0);
        }
    }
}
