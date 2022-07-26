package Temp.Main8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main8 {
        // генерируем строку, заданой длины
        public static String getRandomString(int length){
            String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Random random=new Random();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<length;i++){
                int number=random.nextInt(52);
                sb.append(str.charAt(number));
            }
            return sb.toString();
        }

        // генерируем пол М или Ж
        public static String getRandomSex(){
            String str="МЖ";
            Random random=new Random();
            StringBuffer sb=new StringBuffer();
            int number=random.nextInt(2);
            sb.append(str.charAt(number));

            return sb.toString();
        }

        public static void main(String[] args) throws InstantiationException, IllegalAccessException  {

            //создаем список объектов
            List<Cat> listt = new ArrayList<Cat>();
            Random random=new Random();

            for(int i=0; i<10; i++)
            {
                //добавляем объекты в список
                listt.add(new Cat(getRandomString(random.nextInt(10)+1),random.nextInt(14)+1,getRandomSex()));
            }

            for(Cat mc : listt) {
                System.out.println("Item:" + mc);
            }

            int max = 0;
            double max_sr = 0;

            for(int i=0;i<listt.size();i++){
                //определяем максимальный возраст
                if (max<listt.get(i).getAge())
                    max=listt.get(i).getAge();
                max_sr +=listt.get(i).getAge();//суммируем возраст для определения среднего
            }

            // определяем средний возраст
            max_sr /= listt.size();

            System.out.println("\n/////////////\nMax age = "+max);
            System.out.println("Average_age = "+max_sr);

            List<Cat> listm = new ArrayList<Cat>();//список мальчиков
            List<Cat> listw = new ArrayList<Cat>();//список девочек
            for(int i=0;i<listt.size();i++){

                if(listt.get(i).getGender().equals("М")){
                    listm.add(listt.get(i));
                }
                else  listw.add(listt.get(i));
            }
            for(Cat mc : listm) {
                System.out.println("Item-m:" + mc);
            }
            for(Cat mc : listw) {
                System.out.println("Item-w:" + mc);
            }
        }
    }
