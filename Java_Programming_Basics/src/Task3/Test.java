package Task3;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5,10);
        Rectangle rectangle3 = new Rectangle(5,10, 10, 5);

        System.out.println("Прямоугольник 1:");
        rectangle1.rect_print();

        System.out.println("Прямоугольник 2:");
        rectangle2.rect_print();

        System.out.println("Прямоугольник 3:");
        rectangle3.rect_print();
    }
}
