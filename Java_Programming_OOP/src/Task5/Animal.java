package Task5;

public abstract class Animal implements Comparable<Animal> {
    private String name; // Название животного
    private boolean animalType; //Тип животного (true - хищники, false - травоядные)
    private double weight; // Вес
    private double foodCount; // Количество еды
    private String typeFood; // Тип пищи
    private int velocity; //скорость животного
    private static int predatorsCount ; // количество хищников
    private static int herbivoresCount ; // количество травоядных

    public Animal(String name, boolean animalType, double weight, int velocity) {
        this.name = name;
        this.animalType = animalType;
        this.weight = weight;
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public boolean isAnimalType() {
        return animalType;
    }

    public double getWeight() {
        return weight;
    }

    public int getVelocity() {
        return velocity;
    }

    public static int getPredatorsCount() {
        return predatorsCount;
    }

    public void setPredatorsCount() {
         predatorsCount++;
    }
    public static int getHerbivoresCount() {
        return herbivoresCount;
    }

    public void setHerbivoresCount() {
        herbivoresCount++;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setFoodCount(double foodCount) {
        this.foodCount = foodCount;
    }

    public double getFoodCount() {
        return foodCount;
    }
    //абстрактный метод
    abstract void getCountTypeFood();

    @Override
    public String toString() {
           return "Животное: " + this.name + " - собственный вес: " + this.weight + " кг" + " | съедает "
                   + getFoodCount() + " кг " + getTypeFood() + " каждый день," + " скорость движения: "
                   + getVelocity() + " км/ч";
    }

    //Переопределение с учётом того, что getFoodCount() типа double
    @Override
    public int compareTo(Animal obj) {
        if (this.getWeight() < obj.getWeight())
            return -1;
        else if (obj.getWeight() < this.getWeight())
            return 1;
        return 0;
    }
}
