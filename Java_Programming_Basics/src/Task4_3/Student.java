package Task4_3;

public class Student {
    private String name, gender;
    private int age;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "студент" +
                ", имя: " + name +
                ", пол: " + gender +
                ", возраст: " + age;
    }
}
