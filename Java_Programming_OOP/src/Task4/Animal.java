package Task4;

import java.util.Collection;
import java.util.Comparator;

public abstract class Animal implements Comparable<Animal> {
    private String name; // Название животного
    private boolean animalType; //Тип животного (true - хищники, false - травоядные)
    private double weight; // Вес
    private double foodCount; // Количество еды
    private String typeFood; // Тип пищи

    public Animal(String name, boolean animalType, double weight) {
        this.name = name;
        this.animalType = animalType;
        this.weight = weight;    }

    public String getName() {
        return name;
    }

    public boolean isAnimalType() {
        return animalType;
    }

    public double getWeight() {
        return weight;
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
           return "Животное: " + this.name + " - собственный вес: " + this.weight + " кг" + " | съедает " + getFoodCount() + " кг " + getTypeFood() + " каждый день.";
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
