package Temp.Main8;

public class Cat {
    private String name, gender;
    private int age;


    public Cat(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }


    public String toString() {
        return "Котик"+" имя "+name+" пол "+gender+" возраст "+age;  }

}