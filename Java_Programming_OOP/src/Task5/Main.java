package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.*;

import static Task5.Animal.getHerbivoresCount;
import static Task5.Animal.getPredatorsCount;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Animal> animals = new ArrayList<>();
        //Заполняем наш зоопарк (всего 20 животных):
        animals.add(new Dog("Пёс Тузик", true, 10.0, 10));
        animals.add(new Dog("Пёс Барбос", true, 40.5, 15));
        animals.add(new Cat("Кот Барсик", true, 10.5, 14));
        animals.add(new Cat("Кошка Муська", true, 3, 13));
        animals.add(new Carp("Рыба Карп большой", false, 10.5, 2));
        animals.add(new Carp("Рыба Карп малый", false, 3, 1));
        animals.add(new Chicken("Курочка Ряба", false, 3, 14));
        animals.add(new Chicken("Курица Цыпа", false, 2, 15));
        animals.add(new Eagle("Орёл Глыба", true, 6.8, 300));
        animals.add(new Eagle("Орёл Камень", true, 4, 320));
        animals.add(new Kite("Коршун Крест", true, 3.5, 310));
        animals.add(new Kite("Коршун Радар", true, 0.8, 305));
        animals.add(new Hen("Петух Петро", false, 5.5, 15));
        animals.add(new Hen("Петух Петя", false, 3.5, 14));
        animals.add(new Ling("Щука Дубина", true, 7, 3));
        animals.add(new Mouse("Мышь Полёвка", false, 0.6, 13));
        animals.add(new Wolf("Волк", true, 55, 60));
        animals.add(new Tiger("Тигр", true, 180, 65));
        animals.add(new Cow("Корова Бурёнка", false, 550, 4));
        animals.add(new Sheep("Овечка Сьюзи", false, 55, 32));

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
        System.out.println("ОБЩЕЕ КОЛИЧЕСТВО ХИЩНИКОВ: " + getPredatorsCount());
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
        System.out.println("ОБЩЕЕ КОЛИЧЕСТВО ТРАВОЯДНЫХ: " + getHerbivoresCount());
        System.out.println();
        System.out.println("САМОЕ УПИТАННОЕ ТРАВОЯДНОЕ: \n" + Collections.max(animalsHerbivores));

        //Сортировка после вычисления нормы еды в день в зависимости от веса для каждого животного
        Comparator compareVelocityAnimals = new CompareVelocityAnimals();
        Collections.sort(animals, compareVelocityAnimals);

        System.out.println();
        System.out.println("САМОЕ БЫСТРОЕ ЖИВОТНОЕ: " + animals.get(animals.size() - 1).getName() +
                " его скорость: " + animals.get(animals.size() - 1).getVelocity() + " км/ч");

        System.out.println();
        System.out.println("САМОЕ МЕДЛЕННОЕ ЖИВОТНОЕ: " + animals.get(0).getName() + " его скорость: " +
                animals.get(0).getVelocity() + " км/ч");

    //Запись в файл:
    try (FileWriter writer = new FileWriter("file.txt", true)) {
        writer.write("СПИСОК ЖИВОТНЫХ, ОТСОРТИРОВАННЫЙ ПО ВОЗРАСТАНИЮ СКОРОСТИ ДВИЖЕНИЯ:\n");
        for (Animal animalsInfo : animals) {
               writer.write(animalsInfo.toString() + "\n");
        }
        writer.close();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
