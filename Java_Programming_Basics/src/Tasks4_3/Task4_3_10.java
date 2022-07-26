package Tasks4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4_3_10 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //Создаём список объектов
        List<Student> listStudents = new ArrayList<Student>();
        Random random = new Random();
        //Создаём 100 объектов и добавляем их в список
        for (int i = 0; i < 100; i++) {
            listStudents.add(new Student(getRandomStudentName(random.nextInt(10) + 1),
                    random.nextInt(10) + 16, getRandomSex()));
        }

        System.out.println("ОБЩИЙ СПИСОК УЧАЩИХСЯ: ");
        for (Student st : listStudents) {
            System.out.println("Учащийся: " + st);
        }
        System.out.println();
        System.out.println("СПИСОК УЧАЩИХСЯ ЖЕНСКОГО ПОЛА: ");

        //Создаём список студентов мужского пола
        List<Student> listM = new ArrayList<Student>();
        int countW =0;
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getGender().equals("Ж")) {
                listM.add(listStudents.get(i));
                countW++;
            }
        }
        for (Student stW : listM) {
            System.out.println("Учащаяся женского пола: " + stW);
        }

        System.out.println("ВСЕГО: " + countW + " человек женского пола.");
    }

//Генерируем случайные имена студентов, используя строчные и прописные буквы русского алфавита
    public static String getRandomStudentName(int length) {
        String str = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(66);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
//Генерируем деление по полу М и Ж
    public static String getRandomSex() {
        String str = "МЖ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        int number = random.nextInt(2);
        sb.append(str.charAt(number));
        return sb.toString();
    }
}
