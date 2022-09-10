package Task4;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        //Заполняем наш зоопарк (всего 20 животных):
        animals.add(new Dog("Пёс Тузик", true, 10.0));
        animals.add(new Dog("Пёс Барбос", true, 40.5));
        animals.add(new Cat("Кот Барсик", true, 10.5));
        animals.add(new Cat("Кошка Муська", true, 3));
        animals.add(new Carp("Рыба Карп большой", false, 10.5));
        animals.add(new Carp("Рыба Карп малый", false, 3));
        animals.add(new Chicken("Курочка Ряба", false, 3));
        animals.add(new Chicken("Курица Цыпа", false, 2));
        animals.add(new Eagle("Орёл Глыба", true, 6.8));
        animals.add(new Eagle("Орёл Камень", true, 4));
        animals.add(new Kite("Коршун Крест", true, 3.5));
        animals.add(new Kite("Коршун Радар", true, 0.8));
        animals.add(new Hen("Петух Петро", false, 5.5));
        animals.add(new Hen("Петух Петя", false, 3.5));
        animals.add(new Ling("Щука Дубина", true, 7));
        animals.add(new Mouse("Мышь Полёвка", false, 0.6));
        animals.add(new Wolf("Волк", true, 55));
        animals.add(new Tiger("Тигр", true, 180));
        animals.add(new Cow("Корова Бурёнка", false, 550));
        animals.add(new Sheep("Овечка Сьюзи", false, 55));

        //Вычисление нормы еды в день для каждого животного, в зависимости от типа и веса животнго
        for (Animal zoo : animals) {
            zoo.getCountTypeFood();
        }
        //Сортировка после вычисления нормы еды в день в зависимости от веса для каждого животного
        Comparator compareAnimals = new CompareAnimals();
        Collections.sort(animals, compareAnimals);

        //Вывод отсортированного списка:
        System.out.println();
        System.out.println("СПИСОК ВСЕХ ЖИВОТНЫХ В ЗООПАРКЕ (с учётом сортировки нормы еды в день по убыванию):");

        for (Animal zooAnimal : animals) {
            System.out.println(zooAnimal.toString());
        }

        //Создание отдельной коллекции для хищников, так как воспользоваться Collections.max(predators)
        // не удалось
        List<Animal> animalsPredators = new ArrayList<>();

        System.out.println();
        System.out.println("ХИЩНИКИ:");

        for (Animal predators : animals) {
            if (predators.isAnimalType()) {
                Collections.addAll(animalsPredators, predators);
                System.out.println(predators);
            }
        }
        System.out.println();
        System.out.println("САМЫЙ УПИТАННЫЙ ХИЩНИК: \n" + Collections.max(animalsPredators));

        //Создание отдельной коллекции для травоядных, так как воспользоваться Collections.max(herbivores) также,
        // как и с хищниками не удалось
        List<Animal> animalsHerbivores = new ArrayList<>();

        System.out.println();
            System.out.println("ТРАВОЯДНЫЕ:");
            for (Animal herbivores : animals) {
                if (!herbivores.isAnimalType()) {
                    Collections.addAll(animalsHerbivores, herbivores);
                    System.out.println(herbivores);
                }
            }

        System.out.println();
        System.out.println("САМОЕ УПИТАННОЕ ТРАВОЯДНОЕ: \n" + Collections.max(animalsHerbivores));
    }
}
