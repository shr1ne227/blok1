package practice4_1.task8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Circle(2.5, "blue", false),
                new Rectangle(3, 4),
                new Square(5, "green", true)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.printf("  площадь = %.2f, периметр = %.2f%n", shapes[i].getArea(), shapes[i].getPerimeter());
        }

        Square square = new Square(2);
        square.setWidth(7);
        System.out.println();
        System.out.println("Квадрат после setWidth(7): " + square);
        System.out.println("Сторона = " + square.getSide() + ", площадь = " + square.getArea());
    }
}
