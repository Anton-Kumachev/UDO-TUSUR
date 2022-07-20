package Task3;

public class Rectangle {
    private int x1, y1, x2, y2;
    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }
    public Rectangle(int width, int height) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = width;
        this.y2 = height;
    }
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void rect_print() {
        System.out.print("Поле x1 = " + x1 + "; ");
        System.out.print("Поле y1 = " + y1 + "; ");
        System.out.print("Поле x2 = " + x2 + "; ");
        System.out.println("Поле y2 = " + y2 + "; ");
    }

    public void move(int dx, int dy) {
        this.x1 = x1 + dx;
        this.y1 = y1 + dy;
        this.x2 = x2 + dx;
        this.y2 = y2 + dy;
    }

    public void getWidth(int x1, int x2) {
        int width = x1 - x2;
        if (width > 0) {
            System.out.println(width);
        } else {
            System.out.println(width * (-1));
        }
    }

    public void getHeight(int y1, int y2) {
        int heigh = y1 - y2;
        if (heigh > 0) {
            System.out.println(heigh);
        } else {
            System.out.println(heigh * (-1));
        }
    }

    public void getArea(int x1, int x2, int y1, int y2) {
        int width = x1 - x2;
        int heigh = y1 - y2;
        int area = width * heigh;
        if (area > 0) {
            System.out.println(area);
        } else {
            System.out.println(area * (-1));
        }
    }

    public void getPerimeter(int x1, int x2, int y1, int y2) {
        int width = x1 - x2;
        int heigh = y1 - y2;
        int perimeter = (width * 2) + (heigh * 2);

        System.out.println(perimeter);
    }

    public void ifRectangleSquare(int x1, int x2, int y1, int y2) {
        int width = x1 - x2;
        int heigh = y1 - y2;

        if (width == heigh) {
            System.out.println("Это квардрат");
        }
    }
}
